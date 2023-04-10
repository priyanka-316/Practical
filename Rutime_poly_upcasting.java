package Method_Overriding;
//upcasting --- if the reference  variable of parent class refers
// to the object of child class
class A // parent class
{
	void run() {
		System.out.println("parent clas method");
	}
}
class B extends A{
	void run() {
		System.out.println("Child class Implementation");
	}
}
public class Rutime_poly_upcasting {

	public static void main(String[] args)
	{
		 A obj = new B(); //upcasting
		 obj.run();
	
	}}
