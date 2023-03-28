package constructor;

public class Default_constructor {

	String name;
	
	Default_constructor() // default constructor
	{
		System.out.println("Default constructor called");
	}
	public static void main(String[] args) { 
		// constructor called at the time of object creation with new() keyword
		Default_constructor obje = new Default_constructor();
	}

}
