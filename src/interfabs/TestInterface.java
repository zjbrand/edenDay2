package interfabs;

public class TestInterface {

	public static void main(String[] args) {
		
		Animal dog=new Dog();
		dog.sleep();
		dog.run();
		
		SkinColor cat=new Cat();
		Animal cat1=new Cat();
		
		Leg4Animal cat2=new Leg4Animal();
		cat1.sleep();
		cat1.run();
		System.out.println("--------");
		cat.printColor();
		cat2.jump();
		
		
		BuruAnimal buruDog=new BuruAnimal();
		buruDog.sleep();
		buruDog.run();
		
		Leg4Animal cat3=new Cat();
		cat3.jump();

	}

}
