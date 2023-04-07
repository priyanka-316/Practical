package Super;
/*  super keyword  -- reference variable which refer immediate parent class
3 usage of super keyword
1. refer immediate parent class constructor 
 * */

class Shape2 // parent class
{
	Shape2() // default constructor of parent class
	{
		System.out.println("Hello");
	}
}
class Size2 // child class 
{	
	Size2() // default constructor of child class 
	{
		super(); // Default immediate parent class constructor line no
		System.out.println("Hi");
	}
}

public class Supercon // main method
{

	public static void main(String[] args)
{
		Size2 s= new Size2(); // creating object of child class
	}}
// super() is added in each class constructor  automatically by compiler is no super()