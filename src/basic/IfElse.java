package basic;

public class IfElse {

	public static void main(String[] args) {
		//在三种以上的判断时，用if——else if-->else
		
		int a=3;
		int b=2;
		
		if(a==1) {
			System.out.println("man");
		}else if(a==2) {
			System.out.println("woman");
		}else{
			System.out.println("gay");
		}
		
		if(a==1 && b==2) {//false
			System.out.println("两个条件都满足");
		}else if(a==1 || b==2) {//"||"表示“或”
			System.out.println("满足一个条件");
		}

	}

}
