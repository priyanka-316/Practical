package constructor;

public class Thiskeyword {
	

	int age;
	String name;
	String address;

	// constructor 1 with 2 arguments
	
	Thiskeyword(int age, String name){
		this.age = age;
		this.name = name;
	}

	// constructor 2 with 3 argument

	Thiskeyword(int a, String n,String ad){
		
		age=a;
		name=n;
		address=ad;
		
	}
	public void show() {
		System.out.println("Name=" +name+  "Age=" +age+  "Address" +address);
	}
	public static void main(String[] args) {
		Thiskeyword obj1=new Thiskeyword(10,"Riya");
		Thiskeyword obj2=new Thiskeyword(20,"Rahul","Pune");
		obj1.show();
		obj2.show();
	}
	}
	 


