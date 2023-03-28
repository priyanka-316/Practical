package constructor;
// we are not creating any constructor so compiler provide us a default constructor
 // 0 and null default values provided by default constructor
public class Default_ex 
{
	int Sl_no=1;
	String name=" Solapur";
	void  result() 
	{
		
		System.out.println("Sl_no+" +name);
		
	}
	
	public static void main(String[] arg) 
	{
		
		Default_ex ob = new Default_ex ();
		System.out.println(ob.Sl_no+" "+ob.name);
	}

}
