package packageeg;
// Static variable used to refer to the common property for all the object
public class Static_variable
{
   int rollno;
   String name;
   float fee;
   static String college="AGPIT";
	  
   Static_variable(int rollno,String name,float fee)  // Constructor
   	{
	   this.rollno=rollno;
	   this.name=name;
	   this.fee=fee;
	   
    }
 
   
   void display()     // method 
   
   {
   System.out.println(rollno+" "+name+ " " +fee+" "+college);
   }

public class Static_variable1 // class 2
{
	

	public static void main(String[] args) 
	{
		Static_variable s1 = new Static_variable(102,"Ram",5000);
		Static_variable s2 = new Static_variable(333,"Riya",3000);
		
			s1.display(); // call the  method using first object
			s2.display();//  call the  method using Second object
	
	}}

}
