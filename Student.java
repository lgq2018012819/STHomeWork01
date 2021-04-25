
public class Student {
	private int sid;
	private String name;
	private int age;
	private Sex sex;//gender
	
	public Student(){
	}
	
	public Student(int sid, String name, int age, Sex sex){
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	//get and set
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

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString(){
		return "{" +
				"学号=" + sid +
				",名字='" +name + '\'' +
				",年龄="+ age +
				",性别="+ sex +
				'}';
	}

}

enum Sex{
	男,女
}
