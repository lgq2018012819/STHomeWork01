
public class Student {
	private int sid;
	private String name;
	private int age;
	//private Sex sex;
	private Gender gender;//问题编码1，所有涉及代码均已更改
	
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

	public Gender getGender() {//问题编码1
		return gender;
	}

	public void setGender(Gender gender) {//问题编码1
		this.gender = gender;
	}
	
	@Override
	public String toString(){
		/**return "{" +
				"学号="+sid+
				",名字='"+name+'\''+
				",年龄="+age+
				",性别="+gender+
				'}';
		*问题编号14
		**/
		return "{" +
		"学号=" + sid +
		",名字='" + name + '\'' +
		",年龄="+ age +
		",性别="+ gender +
		'}';
	}

}

enum Gender{
	男,女
}
