package Super;

class Student{ // parent class
	int stud_id;
	String name;
	Student(int stud_id,String name) //parent class cons
	{
		this.stud_id=stud_id;
		this.name=name;
	}
}
 class Course extends Student{ // child class 
	 float cou_fees;  // child class data member
	 Course(int stud_id,String name,float cou_fees)
	 {
		 super(stud_id,name); // try to reuse parent class con
		 this.cou_fees=cou_fees;
	 }
    void show() 
    {
    	
		System.out.println(stud_id+ " "+name+" " +cou_fees);
    }
 }
public class Solapur_Batch {

	public static void main(String[] args) 
	{
	 Course obj = new Course(1,"priyanka", 2500f);
	 obj.show();
	}}

