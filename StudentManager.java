
import java.util.*;
//�ӿڵ�ʵ����

public class StudentManager implements StudentInterface{
	//App�������������������������̣��������ѡ��˵����ȴ��û�����ѡ�Ȼ�����ѡ��ִ����Ӧ������
	public void welcome(){
		System.out.println("********************��ӭʹ��************************");//����
		System.out.println("ϵͳ��ʼ���ɹ�����");
	}
	
	public void exit(){
		System.out.println("********************ллʹ��************************");//�˳�
	}
	
	public void showMenu(){
		//��ʾϵͳ�˵�
		System.out.println("\n��ѡ�������");
		System.out.println("********************");
		System.out.println("*  1-->����ѧ����Ϣ  *");
		System.out.println("*  2-->������������  *");
		System.out.println("*  3-->��������ɾ��  *");
		System.out.println("*  4-->���������޸�  *");
		System.out.println("*  5-->���ѧ����Ϣ  *");
		//���ӹ����Ѿ�ʵ��
		System.out.println("******���ӹ���*******");
		System.out.println("*  6-->����ѧ�Ų���  *");
		System.out.println("*  7-->����ѧ��ɾ��  *");
		System.out.println("*  8-->����ѧ���޸�  *");
		System.out.println("*  9-->�˳�                *");
		System.out.println("********************");
	}
	
	//������9.
	//ʹ��HashMap�������е�ѧ����Ϣ�������е�Entry��key��ѧ�š�value����ѧ�Ŷ�Ӧ��ѧ������
	private Map<Integer,Student> students = new HashMap<Integer,Student>();//
	
	//��Scanner��������
	private Scanner scanner = new Scanner(System.in);
	
	/**
	 * 1.���ѧ����Ϣ
	 */
	@Override
	public boolean addStudent() {
		// ����ѧ������Ϣ
		int sid = MyTools.getInputNumber("������ѧ����ѧ�ţ�", scanner);
		String name = MyTools.getInputString("������ѧ����������", scanner);
		int age = MyTools.getInputNumber("������ѧ�������䣺", scanner);
		Gender gender = MyTools.getInputString("������ѧ�����Ա�", scanner).equals("��")?Gender.��:Gender.Ů;
		//����ѧ������
		Student s = new Student(sid,name,age,gender);
		students.put(sid,s);
		System.out.println("���ѧ����Ϣ�ɹ���");
		return true;
	}
	
	/**
	 * 2.������������ѧ��
	 */
	//2.������������ѧ�����ɹ���
	@Override
	public List<Student> findStudentByName(String name) {
		//���صõ�ѧ�����б�
		List<Student> list = new ArrayList<Student>();
		// �������е�ѧ����Ȼ���name������бȽ�
		Collection<Student> stus = students.values();
		Iterator<Student> iterator = stus.iterator();
		while(iterator.hasNext()){
			Student student = iterator.next();
			if(student.getName().equals(name)){
				list.add(student);
			}
		}
		//return list.size()==0?null:list;������14
		return list.size() == 0 ? null : list;
	}
	
	public void findStudentByName() {
		// ʵ������ҵ�񷽷�
		String name = MyTools.getInputString("������Ҫ���ҵ�ѧ����������", scanner);
		List<Student> stus = findStudentByName(name);
		if(stus == null){
			System.out.println("��������ѧ�������ڣ�");
		}else{
			//��ӡ���е�ѧ������Ϣ
			System.out.println("���ҵ���ѧ������Ϣ���£�");
			for(int i = 0; i < stus.size() ; i++){
				System.out.println(stus.get(i));
			}
		}
	}
	
	/**
	 * 3.��������ɾ��ѧ����Ϣ
	 */
	//3.��������ɾ��ѧ����Ϣ
	public List<Student> deleteStudentByName(String name) {
			List<Student> list = new ArrayList<Student>();
			// �������е�ѧ����Ȼ���name������бȽ�
			Collection<Student> stus = students.values();
			Iterator<Student> iterator = stus.iterator();
			while(iterator.hasNext()){
				Student student1 = iterator.next();
				if(student1.getName().equals(name)){
			    	 students.remove(student1);
			       }
			    }
			return list.size() == 0 ? null : list;
		}
	
		public void deleteStudentByName() {
			// ����ʵ������ҵ�񷽷�
			String name = MyTools.getInputString("������Ҫɾ����ѧ����������", scanner);
			List<Student> stus = deleteStudentByName(name);
			if(stus != null){
				System.out.println("��������ѧ�������ڣ�");
			}else{
				System.out.println("ɾ���ɹ���");
			}
		}

	/**
	* 4.���������޸�ѧ����Ϣ
	*/
	//4.���������޸�ѧ����Ϣ���ѳɹ���
	@Override
	public List<Student> modifyStudentByName(String name) {
		List<Student> list = new ArrayList<Student>();
		// �������е�ѧ����Ȼ���name������бȽ�
		Collection<Student> stus = students.values();
		Iterator<Student> iterator = stus.iterator();
		while(iterator.hasNext()){
			Student student1 = iterator.next();
			if(student1.getName().equals(name)){
		    	 //�������������Ҫ�޸ĵ���Ϣ
					int sid = MyTools.getInputNumber("�������µ�ѧ�ţ�", scanner);
					name = MyTools.getInputString("�������µ�������", scanner);
					int age = MyTools.getInputNumber("�������µ����䣺", scanner);
					Gender gender = MyTools.getInputString("�������µ��Ա�", scanner).equals("��")?Gender.��:Gender.Ů;
					//���벢��ȡ����
					student1.setSid( sid );
					student1.setName( name );
					student1.setAge( age );
					student1.setGender( gender );
		       }
		    }
		return list.size() == 0 ? null : list;
	}
	
	public void modifyStudentByName() {
		// ����ʵ������ҵ�񷽷�
		String name = MyTools.getInputString("������Ҫ�޸ĵ�ѧ����������", scanner);
		List<Student> stus = modifyStudentByName(name);
		if(stus == null){
			System.out.println("�޸ĳɹ���");
		}else{
			System.out.println("��������ѧ�������ڣ�");
		}
	}
	
/**
 * 5.�����������ѧ����Ϣ
 */
	//5.�����������ѧ����Ϣ���ɹ���
	@Override
	public void showAll() {
		// ��ȡѧ����ѧ��
		Set<Integer> sids = students.keySet();
		Iterator<Integer> iterator = sids.iterator();
		while(iterator.hasNext()){
			Integer sid = iterator.next();
			Student student = students.get(sid);
			System.out.println(student);
		}
		
	}

/**
 * ���ӹ����ѳɹ�ʵ��
 * 6.����ѧ�Ų���ѧ��
 */
	//���ӹ����ѳɹ�ʵ��
	//6.����ѧ�Ų���ѧ�����ɹ���
	@Override
	public Student findStudentBySid(int sid) {
		// ����ѧ�Ų��ң��Աȴ������
		Student student = students.get(sid);
		if(student != null){
			System.out.println(student);
		}else{
			System.out.println("��ѧ�������ڣ�");
		}
		return student;
	}
	
	public Student findStudentBySid() {
		//ʵ������
		int sid = MyTools.getInputNumber("������Ҫ���ҵ�ѧ����ѧ�ţ�", scanner);
		return findStudentBySid(sid);
	}
	
	/**
	 * 7.����ѧ��ɾ��ѧ����Ϣ
	 */
	//7.����ѧ��ɾ��ѧ����Ϣ���ɹ���
	@Override
	public boolean deleteStudentBySid(int sid) {
		// ��ȡѧ��ɾ��
		Student student = students.remove(sid);
		//return student==null?false:true;������14
		return student == null ? false : true;
	}
	
	public void deleteStudentBySid() {
		// ʵ������ҵ�񷽷�
		int sid = MyTools.getInputNumber("������Ҫɾ����ѧ����ѧ�ţ�", scanner);
		boolean bool = deleteStudentBySid(sid);
		if(bool){
			System.out.println("ɾ��ѧ���ɹ���");
		}else{
			System.out.println("��ѧ�������ڡ�");
		}
	}
	
/**
 * 8.����ѧ���޸�ѧ����Ϣ
 */
	//8.����ѧ���޸�ѧ����Ϣ���ɹ���
	@Override
	public boolean modifyStudentBySid(int sid) {
		// 
		Student student = students.get(sid);
		if(student != null){
			//�������������Ҫ�޸ĵ���Ϣ
			sid = MyTools.getInputNumber("�������µ�ѧ����ѧ�ţ�", scanner);
			String name = MyTools.getInputString("�������µ�ѧ����������", scanner);
			int age = MyTools.getInputNumber("�������µ�ѧ�������䣺", scanner);
			Gender gender = MyTools.getInputString("�������µ�ѧ�����Ա�", scanner).equals("��")?Gender.��:Gender.Ů;
			//���벢��ȡ����
			student.setSid(sid);
			student.setName(name);
			student.setAge(age);
			student.setGender(gender);
		}
		return student == null ? false : true;
	}
	
	public void modifyStudentBySid() {
		// ����ʵ������ҵ�񷽷�
		int sid = MyTools.getInputNumber("������Ҫ�޸ĵ�ѧ����ѧ�ţ�", scanner);
		boolean bool = modifyStudentBySid(sid);
		if(bool){
			System.out.println("�޸�ѧ����Ϣ�ɹ���");
		}else{
			System.out.println("ѧ�������ڡ�");
		}
	}
	
}//public class StudentManager implements StudentInterface�Ľ�����������6


