package constructor;

public class const_overload {

int age;
String name;
String address;

// constructor 1 with 2 arguments
const_overload(int a, String n){
	age = a;
	name = n;
}

// constructor 2 with 3 argument

const_overload(int a, String n,String ad){
	
	age=a;
	name=n;
	address=ad;
	
}
public void show() {
	System.out.println("Name=" +name+  "Age=" +age+  "Address" +address);
}
public static void main(String[] args) {
	const_overload obj1=new const_overload(10,"Riya");
	const_overload obj2=new const_overload(20,"Rahul");
	obj1.show();
	obj2.show();
}
}
 