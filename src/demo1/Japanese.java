package demo1;

public class Japanese extends Person {
	
	public String city;

	@Override
	public void say() {
		System.out.println("jp say");

		super.eat();
	}
}
