package basic;

public class PrimitiveTypeTest {
	
	public static void main(String[] args) {
		//代码联想 alt+/
		//byte 0001,0000,
		System.out.println("基本类型：byte 二进制位数："+Byte.SIZE);
		System.out.println("包装类：java.lang.Byte");
		System.out.println("最小值："+Byte.MIN_VALUE);
		System.out.println("最大值："+Byte.MAX_VALUE);
		System.out.println("----------------------");
		
		//short Short
		System.out.println("基本类型：short 二进制位数："+Short.SIZE);
		System.out.println("最小值："+Short.MIN_VALUE);
		System.out.println("最大值："+Short.MAX_VALUE);
		System.out.println("---------------------");
		
		//int
		System.out.println("基本类型：int 二进制位数："+Integer.SIZE);
		System.out.println("最小值："+Integer.MIN_VALUE);
		System.out.println("最大值："+Integer.MAX_VALUE);
		System.out.println("---------------------");
		
		//long
		System.out.println("基本类型：long 二进制位数："+Long.SIZE);
		System.out.println("最小值："+Long.MIN_VALUE);
		System.out.println("最大值："+Long.MAX_VALUE);
		System.out.println("---------------------");
		//1970/1/1 00
		long time=System.currentTimeMillis();
		System.out.println(time);//1,702,779,079,851 1702779103925
		
		//float 包装类Float
		System.out.println("基本类型：Float 二进制位数："+Float.SIZE);
		System.out.println("最小值："+Float.MIN_VALUE);
		System.out.println("最大值："+Float.MAX_VALUE);
		System.out.println("---------------------");
		
		//double 包装类Double
		System.out.println("基本类型：double 二进制位数："+Double.SIZE);
		System.out.println("最小值："+Double.MIN_VALUE);
		System.out.println("最大值："+Double.MAX_VALUE);
		System.out.println("---------------------");
		
		//char
		System.out.println("基本类型：Character 二进制位数："+Character.SIZE);
		System.out.println("最小值："+(int)Character.MIN_VALUE);
		System.out.println("最大值："+(int)Character.MAX_VALUE);
		System.out.println("---------------------");
		
		//ASC
		char ch='a';
		int chInt=(int)ch;
		System.out.println("a对应的ASC："+chInt);
		
		long munlong=9999999999999L;
		float fl=34353.344f;
	}

}
