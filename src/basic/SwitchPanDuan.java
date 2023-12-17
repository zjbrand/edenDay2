package basic;

public class SwitchPanDuan {

	public static void main(String[] args) {
		
		int chose=6;
		switch(chose) {
		case 1:
			System.out.println("执行第一项操作");
			break;
		case 2:
			System.out.println("执行第二项操作");
			break;
		case 3:
			System.out.println("执行第三项操作");
			break;
		default:
			System.out.println("不执行操作");
		
		}
		score();

		
	}
//如果成绩在60-70，打印D;成绩在71-80，打印C；成绩在81-90，打印B；成绩在91-100，打印A
	
	public static void score() {
		int score = 70;

		switch (score/10) {
		    case 6:
		        System.out.println("D");
		        break;
		    case 7:
		        System.out.println("C");
		        break;
		    case 8:
		        System.out.println("B");
		        break;
		    case 9:
		    case 10:
		        System.out.println("A");
		        break;
		    default:
		        System.out.println("未知等级");
		        break;
		}
		
		int score1 = 85;

		if (score >= 91 && score <= 100) {//&&-->and
		    System.out.println("A");
		} else if (score >= 81 && score <= 90) {
		    System.out.println("B");
		} else if (score >= 71 && score <= 80) {
		    System.out.println("C");
		} else if (score >= 60 && score <= 70) {
		    System.out.println("D");
		} else {
		    System.out.println("未知等级");
		}
	}
	
}
