package demo1;

import java.util.Date;

public class Person {
	private String name="aaa";
	int height=170;
	protected int weight=120;
	public Date currentTime=new Date();//1998/12/24
	
	public String birthday="1998/12/24";
	
	public int eat() {
		System.out.println("person eat");
		return 11;
	};
	
	public static void say() {
		System.out.println("person say");
	}	
	
	

}
