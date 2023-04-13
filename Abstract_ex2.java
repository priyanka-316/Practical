package Abstraction;
// create a abstract class with two abstract method areaofRectangle and perimeterofRectangle.
abstract class AbstractMethod1
{
	abstract void areaofRectangle();
	abstract void peremeterofRectangle();
		
}
class Test1 extends AbstractMethod1{
	int l=10 ,w=5;
	void areaofRectangle() 
	{
		int a = l*w;
		System.out.println("Area of Rectangle is:-"+a);
		
	}
	@Override
	void peremeterofRectangle() {
		// TODO Auto-generated method stub
		
	}
}
class Test2 extends AbstractMethod1{
	void peremeterofRectangle() {
		int l=5,w=6;
		int p = 2*(l+w);
		System.out.println("Perimeter of Rectangle is:- "+p);
	}

	@Override
	void areaofRectangle() {
		// TODO Auto-generated method stub
		
	}
}
public class Abstract_ex2{
	public static void main(String[] args) {
		Test1 t1= new Test1();
		Test2 t2 = new Test2();
		t1.areaofRectangle();
		t2.peremeterofRectangle();
	}
}


