package demo1;

public class Testduotai {

	public static void main(String[] args) {
		
				
		Person[] arr= {new Person(),new Japanese(),new English(),new French()};
		for(int i=0;i<arr.length;i++) {
			arr[i].say();
		}
		System.out.println("---------------");
		
		Object[] arrObj= {new Person(),new Japanese(),new English(),new French()};
		//for(int i=0;i<arrObj.length;i++) {
		for(Object obj:arrObj) {
			//Object obj=arrObj[i];
			if(obj instanceof Japanese) {
				Japanese objPerson=(Japanese)obj;
				objPerson.say();
			}else if(obj instanceof Person) {
				Person objPerson=(Person)obj;
				objPerson.say();
				System.out.println(objPerson.currentTime);
			}else if(obj instanceof English) {
				Person objPerson=(English)obj;
				objPerson.say();
			}
		}
	}
	
}
