
@FunctionalInterface
interface Demo{
	void disp();
}

class Animal{
	public void eat() {
		System.out.println("Animal Eats");
	}
	public void animalAlwaysHuntsAndEat() {
		System.out.println("Hunt and Eat in Animal");
	}
}
class Tiger extends Animal{
	public void  eat() {
		System.out.println("Tiget Hints and Eat");
	}
	@Override
	public void animalAlwaysHuntsAndEat() {
		System.out.println("Hunt and Eat in Tiger");
	}
}


public class LaunchAn2 {
	public static void main(String ar[]) {
		Demo d = ()->{
			System.out.println("Lambda");
		};
	}
	 
}
