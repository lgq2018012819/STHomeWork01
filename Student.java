
public class Student {
	private int sid;
	private String name;
	private int age;
	//private Sex sex;
	private Gender gender;//�������1�������漰������Ѹ���
	
	public Student(){
		
	}
	
	public Student(int sid, String name, int age, Gender gender){
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {//�������1
		return gender;
	}

	public void setGender(Gender gender) {//�������1
		this.gender = gender;
	}
	
	@Override
	public String toString(){
		/**return "{" +
				"ѧ��="+sid+
				",����='"+name+'\''+
				",����="+age+
				",�Ա�="+gender+
				'}';
		*������14
		**/
		return "{" +
		"ѧ��=" + sid +
		",����='" + name + '\'' +
		",����="+ age +
		",�Ա�="+ gender +
		'}';
	}

}

enum Gender{
	��,Ů
}
