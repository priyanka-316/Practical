package Abstraction;

abstract class Parentabs{
	Parentabs() // cons
	{
		System.out.println("No-args COns");
	}

abstract void show(); //abstract method

	void run()  // non abstract method
	{
		System.out.println("Non abstract method");
	}
}
class Childabs extends Parentabs{
	@Override
	void show() {
		System.out.println("Parent class abstrct method");
		
	}
}
public class Abstract_eg {

	public static void main(String[] args) {
		Parentabs obj = new Childabs();
		obj.show();
		obj.run();

	}

}
