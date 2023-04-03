package Inheritance;

public class Parents_simple_class 
{
	int marks = 85;
}
class Simple_class extends  Parents_simple_class {
	int Additional_percentage = 5;
	public static void main(String[] args) 
	{
		Simple_class obj = new Simple_class();
		System.out.println("Total marks:" + (obj.marks+obj.Additional_percentage));
	}
}

