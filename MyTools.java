import java.util.Scanner;
//工具类:实现输入数字或者字符串的传值

public class MyTools {
	private MyTools(){	  }
	//得到指定区间的随机数。min包含或max不包含
	public static int getRandomNumber(int min, int max){
		return (int)(Math.random()*(max-min)+min);
	}
	//给用户提示信息的同时，请用户输入一个整数
	public static int getInputNumber(String msg, Scanner scanner){
		System.out.println(msg);
		return scanner.nextInt();
	}
	//给用户提示信息的同时，请用户输入一个字符串
	public static String getInputString(String msg, Scanner scanner){
		System.out.println(msg);
		return scanner.next();
	}
}
