import java.util.Scanner;

public class StudentSystemApp {
	public static void main(String[] args) {
		// 写个变量调用StudentManager里的所有实现方法
		StudentManager manager = new StudentManager();
		//执行在其Main方法中执行StudentManager的App方法
		manager.welcome();
		Scanner scanner = new Scanner(System.in);
		while(true){
			manager.showMenu();
			int input = MyTools.getInputNumber("请选择您的操作：",scanner);
			switch(input){
				case 1:
					manager.addStudent();//插入学生信息
					break;
				case 2:
					manager.findStudentByName();//根据姓名查找
					break;
				case 3:
					manager.deleteStudentByName();//根据姓名删除
					break;
				case 4:
					manager.modifyStudentByName();//根据姓名修改
					break;
				case 5:
					manager.showAll();//输出所有学生信息
					break;
				//附加功能
				case 6:
					manager.findStudentBySid();//根据学号查找
					break;
				case 7:
					manager.deleteStudentBySid();//根据学号删除
					break;
				case 8:
					manager.modifyStudentBySid();//根据学号修改
					break;
				case 9:
					manager.exit();//退出
					return;
			}
		}
		
	}

}
