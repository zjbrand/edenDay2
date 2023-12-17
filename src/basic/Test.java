package basic;

public class Test {

	public static void main(String[] args) {
		//runloop();
		//runIfElse();
		//hejiu();
		max();
	}
	public static void runloop(){
		int sum = 0;
		
		for(int i=0;i<5;i++) {//i=0,1,2,3,4
			sum +=2;
		}
		System.out.println("累加："+sum);
		
		int i=0;
		int sum1=0;
		while(i<6) {
			sum1+=2;
			i++;
		}
		System.out.println("while循环sum："+sum1);
	}
	
	public static void runIfElse() {
		int a=10;
		int b=7;
		int max=0;
		int min=0;
		if(a==2) {//>,<,<>
			System.out.println("a=3是对的");
		}else {
			System.out.println("a不等于3");
		}
		//三目运算符
		max=a>b?a:b;//max=a>b?a:b
		min=a<b?a:b;
		System.out.println("ab的最大值是："+max);
	}
//习题1：判断一下是否有20岁，有的话打印：你已经20了，可以喝酒；如果没有20，打印：你不能喝酒。
//习题2：用三目运算找出三个值中的最大值
	
	public static void hejiu() {
		int age=21;
		if(age>=20) {
			System.out.println("你已经20了，可以喝酒；");
		}else {
			System.out.println("没到20，你不能喝酒。");
		}
	}
	
	public static void max() {
		int a=3;
		int b=8;
		int c=5;
		int temp=0;
		int max=0;
		temp=a>b?a:b;
		max=temp>c?temp:c;
		System.out.println("三个值中最大值是："+max);
	}
}
