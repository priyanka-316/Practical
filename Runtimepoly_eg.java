package Method_Overriding;

class Subject // parent class
{
	int marks() {
		return 0;
	}
}
class Maths extends Subject //child class 1
{
	int marks() {
		return 65;
	}
}
class Science extends Subject //child class 2
{
	int marks() {
		return 90;
	}
}
class English extends Subject //child class 3
{
	int marks() {
		return 85;
	}
}

class Computer extends Subject //child class 4
{
	int marks() {
		return 77;
	}
}
class Physics extends Subject //child class 5
{
	int marks() {
		return 60;
	}
}
public class Runtimepoly_eg {

	public static void main(String[] args) {
		
		Subject stud; // reference variable of parent class(upcasting)
		stud=new Computer();	
		System.out.println("Marks of Computer  :"  +stud.marks());
		stud=new English();
		System.out.println("Marks of English :"+stud.marks());
	}}

	

