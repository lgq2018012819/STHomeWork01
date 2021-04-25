import java.util.List;

public interface StudentInterface {

	void showAll();//输出所有学生信息
	
	boolean addStudent();//插入学生信息
	
	List<Student> findStudentByName(String name);//按姓名查找学生
	/*可能存在重名，用列表输出*/
	List<Student> deleteStudentByName(String name);//按姓名删除学生
	
	List<Student> modifyStudentByName(String name);//按姓名修改信息
	//附加功能
	Student findStudentBySid(int sid);//按学号查找学生
	
	boolean deleteStudentBySid(int sid);//按学号删除学生
	
	boolean modifyStudentBySid(int sid);//按学号修改信息
}