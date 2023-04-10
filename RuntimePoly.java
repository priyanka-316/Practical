package Method_Overriding;
/* Runtime Polymorphism -- Dynamic method dispatch
 *Overload a static method in java -- compile time Polymorphism
 overridden method called by the reference variable of parent class
 overridden method is resolved at runtime rather than compile */



class Java_student // parent class
{
	String quality() // parent method
	{
		return null;
	}
}
class Seema extends Java_student //child class 1
{
	String quality() //overridden method
	{
		return "Active";
	}
}
class Neha extends Java_student //child class 2
{
	String quality() {
		return "Irregular";
	}
}
class Ram extends Java_student //child class 3
{
	String quality() {
		return "good nature";
	}
}
class Pooja extends Java_student // child class 4
{
	String quality() {
		return "Active";
	}
}
public class RuntimePoly {

	public static void main(String[] args) {
		Java_student js; // reference variable of parent class(upcasting)
		js=new Ram();	
		System.out.println("Quality of Pooja is :"  +js.quality());
		js= new Neha();
		System.out.println("Quality of Neha is :"  +js.quality());
		}}