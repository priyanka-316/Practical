// final keyword  ----- provide restriction
// final variable --- cannot change the value of final variable

package Final_Keyword;

public class Finalvariable {
	final int value= 50; // blank initialization of final variable
	void display() {
		System.out.println(value);
		// we can't change the value of final variable
		// compile error
	}

	public static void main(String[] args) {
		Finalvariable f = new Finalvariable(); // creating object
		f.display();	
}}
