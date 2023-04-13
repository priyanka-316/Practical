package Abstraction;
abstract class Testabstract // abstract class
{
	abstract void display(); // abstract method
		
	}
	class Demo1 extends Testabstract //1st child class
	{
		void display() // abstract method of parent class
		{
			System.out.println("Demo1 method invoked");
		}}
	
class Demo2 extends Testabstract //1st child class
{
	void display() 
	{
		System.out.println("Demo2 method invoked");
	}
}

public class Abstract_method {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.display();
		Demo2 d2= new Demo2();
		d2.display();	
}}
