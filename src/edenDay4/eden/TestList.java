package edenDay4.eden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		int[] aa= {1,3,53};//数组
		List<String> lst=new ArrayList<>();
		lst.add("Hello");
		lst.add("world");
		lst.add("ni");
		lst.add("hao");
		//lst{"Hello","world","ni","hao"}
		//        0      1      2     3   4
		//遍历方式
		for(String str:lst) {
			System.out.println(str);
		}
		
		lst.remove(0);
		lst.remove("nii");//找不到不执行
		System.out.println("------------------------");
		for(int i=0;i<lst.size();i++) {//1234==>0123
			System.out.println(lst.get(i));
		}
		System.out.println("------------------------");
		List<String> lstTmp=Arrays.asList("aaaa","bbbb","123");
		for(String str1:lstTmp) {
			System.out.println(str1);
		}
		System.out.println("------------------------");
		lst.addAll(lstTmp);
		for(String str2:lst) {
			System.out.println(str2);
		}
		
		lst.add(1,"xxxxxxxxx");
		System.out.println("------------------------");
		lst.addAll(lstTmp);
		lst.add("ni");
		for(String str2:lst) {
			System.out.println(str2);
		}
		

	}

}
