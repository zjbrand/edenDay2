package basic;

public class ShuZu {

	public static void main(String[] args) {
		int[] arr= {2,5,0,8};
		//arr[0]=2  arr[1]=5  arr[2]=0 arr[3]=8;index=0~3
		//遍历
		for(int i=0;i<arr.length;i++) {
			if(i==1) {
				continue;//跳过
				//break;//中断
			}
			System.out.println("index:"+i+"->var:"+arr[i]);
		}
		//for--break,for--continue
		int i=0;
		int j=0;
		//先执行+1,后执行打印		
		System.out.println(++i);
		//先执行打印，后执行i+1
		System.out.println(j++);
		System.out.println(j);
			
		}
	//i++;++i
	
	
	
}
