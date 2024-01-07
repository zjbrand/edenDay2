package edenDay4.eden;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// HashMap,LinkedHashMap,TreeMap
		System.out.println("------------HashMap------------");
		testHashMap();
		System.out.println("------------LinkedHashMap------------");
		testLinkedHashMap();
		System.out.println("------------TreeHashMap------------");
		testTreeHashMap();
	}
	
	public static void testHashMap() {
		//Map<Integer,String>
		//     key     value
		Map<Integer,String> hashMap=new HashMap<>();
		
		hashMap.put(5, "vvv");
		hashMap.put(9, "ccc");
		hashMap.put(2, "aaa");
		hashMap.put(8, "45445");
		hashMap.put(5, "4d");
		hashMap.put(3, "ddd");
				
		for(Integer k:hashMap.keySet()) {
			
			System.out.println(k+":"+hashMap.get(k));
		}
		System.out.println("-------------------------");
		for(Entry<Integer,String> entry:hashMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());			
		}
		/*int i=1;
		for(Entry<Integer,String> entry:hashMap.entrySet()) {
			if(i==3) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			i++;
		}*/
	}
	
	public static void testLinkedHashMap() {
		Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
		
		linkedHashMap.put(5, "vvv");
		linkedHashMap.put(9, "ccc");
		linkedHashMap.put(2, "aaa");
		linkedHashMap.put(8, "45445");
		linkedHashMap.put(5, "4d");
		linkedHashMap.put(3, "ddd");
		
			for(Integer k:linkedHashMap.keySet()) {
			
			System.out.println(k+":"+linkedHashMap.get(k));
		}
		
	}
	public static void testTreeHashMap() {
		Map<Integer,String> treeMap=new TreeMap<>();
		
		treeMap.put(5, "vvv");
		treeMap.put(9, "ccc");
		treeMap.put(2, "aaa");
		treeMap.put(8, "45445");
		treeMap.put(5, "4d");
		treeMap.put(3, "ddd");
		
			for(Integer k:treeMap.keySet()) {
			
			System.out.println(k+":"+treeMap.get(k));
		}
	}

}
