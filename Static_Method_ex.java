package packageeg;

public class Static_Method_ex
{
 int m = 30; // instance variable
 static int n= 20; //static variable
 
 static int add(int a, int b)// static method
 {
    return a+b;
 }
	public static void main(String[] args) {
		int c = Static_Method_ex.add(5, 4);
		System.out.println(c);
	// we can not call non static variable
	// inside main without obj because main method is a satatic	
		Static_Method_ex refvar = new Static_Method_ex();
		
		System.out.println(refvar.m); // m is non static
		System.out.println(n); // n is static

	}

}
