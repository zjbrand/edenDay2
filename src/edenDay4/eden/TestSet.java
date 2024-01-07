package edenDay4.eden;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	
	public static void main(String[] args) {
		//HashSet, LinkedHashSet,TreeSet都实现Set接口
		System.out.println("----------HashSet----------");
		testHashSet();//Set去除重复
		System.out.println("----------LinkHashSet----------");
		testLinkedHashSet();
		System.out.println("----------TreeSet----------");
		testTreeSet();
	}

	public static void testHashSet() {
		Set<String> set=new HashSet<>();
		
		set.add("ccc");
		set.add("bbb");
		set.add("aaa");
		set.add("best");
		set.add("aaa");
		
		for(String n:set) {
			System.out.println(n);
		}
	}
	
	public static void testLinkedHashSet() {
		//代码联想----alt+/
		Set<String> linkedHashSet=new LinkedHashSet<String>();
		linkedHashSet.add("best");
		linkedHashSet.add("aaa");
		linkedHashSet.add("bbb");
		linkedHashSet.add("ccc");		
		linkedHashSet.add("aaa");
		
		for(String n:linkedHashSet) {
			System.out.println(n);
		}
	}
	
	public static void testTreeSet() {
		Set<String> treeSet=new TreeSet<String>();
		treeSet.add("best");
		treeSet.add("aaa");
		treeSet.add("bbb");
		treeSet.add("ccc");		
		treeSet.add("aaa");
		
		for(String n:treeSet) {
			System.out.println(n);
		}
	}
}
