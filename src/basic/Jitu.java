package basic;

public class Jitu {

	public static void main(String[] args) {
		//已知农场一共有鸡和兔50，又知腿120只，问鸡和兔共有多少只
		
		//假设鸡是x只
		for(int x=0;x<50;x++) {
			if(2*x+4*(50-x)==120) {
				
				System.out.println("农场有鸡："+x+"");
				int tu=50-x;
				System.out.println("农场有兔："+tu+"只");	
	}
	}
	}
}
