package Super;
// by using super keyword we can use parent class data member

class Shape{ // parent class
	String name= "Circle"; // data member of parent class
}
class Size extends Shape //child class
{
	String name= "No Size"; //data member of the child class
	void print() { //child class method
		System.out.println(name); //it represent child class
		// it represent immidiate represent class super1
		System.out.println(super.name);
	}
}
public class super1 
{
public static void main(String[] args) {
	Size obj = new Size();
	obj.print();
}
}
