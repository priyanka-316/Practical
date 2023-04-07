package Super;
//3. refer immediate parent class method
class Shape1
{
	void print() {
		System.out.println("Print circle");
	}
}
class Size1 extends Shape1{
	public static Size1 s;

	void print() {
		System.out.println("Print Triangle");
	}
	void display() {
		System.out.println("Print nothing");
	}

void show() {
	super.print();
	display();
	print();
}
}
public class Super_method 
{
public static void main(String[] args) {
	Size1 s = new Size1();
	s.show();
}
}
