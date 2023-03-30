package packageeg;

public class Static_Method1 {
	int rollno;
	   String name;
	   float fee;
	   static String college="AGPIT";
	    
	   static void change()
	   {
		   college="SRM";
	   }
		  
	   Static_Method1(int rollno, String name,float fee)  // Parameterized Constructor
	   	{
		   this.rollno=rollno;
		   this.name=name;
		   this.fee=fee;
	   	}
	void display() // user defined method
	{
		System.out.println(rollno+" "+name+ " " +fee+" "+college);
	}
	
	public class Static_Method{
	public static void main(String[] args)
	{
	 // no need to create object for static method
		
		// calling static method with class  name
		Static_Method1.change();
		// creating object
		Static_Method1 s1= new Static_Method1(101,"ABC",1000);
	
	Static_Method1 s2= new Static_Method1(102,"EFG",2000);
	  		  
					 s1.display();
					 s2.display();
	}
	
	
	}	

}
