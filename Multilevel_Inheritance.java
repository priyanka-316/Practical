package Inheritance;

public class Multilevel_Inheritance
{

	public static void main(String[] args)
{
		SIChild2 child = new SIChild2();
		child.display();
		child.show();
		child.print();

	}
}
 class SIParents1 //parent class
 {
	 void show()
	 {
		 System.out.println("Show the deatils of parents class");
	 }
 	}
 class SIChild1 extends SIParents1
 	{
	 void display() {
		 System.out.println("display the result of the child class 1");
	 }
 	}
 class SIChild2 extends SIChild1
 		{
	 void print() {
		 System.out.println("Print the output of the child class 2");
	 }
	}
