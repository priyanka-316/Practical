package access_modifier;
//private data member,constructor/method/not for class expcept nested class
class Test{
private int a = 10;
private void diaplay() 
{
	System.out.println("Private method");
}
}
public class private_acc_modi {

	public static void main(String[] args) {
		{
			Test obj = new Test();
			System.out.println(obj.a); // outside the class cannot access the data member
			obj.display(); //outside the class cannot access the  method
		}
		
	}

}
