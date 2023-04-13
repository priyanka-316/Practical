package Abstraction;

abstract class Bank{
	abstract  int rateofInterest();	
}
class RBI extends Bank{
	int rateofInterest(){
		return 7;
	}
}
class SBI extends Bank{
	int rateofInterest(){
		return 8;
	}
}
class PNB extends Bank{
	int rateofInterest(){
		return 9;
	}
}
class BOB extends Bank{
	int rateofInterest(){
		return 6;
	}
}
public class Abstract_ex3 {

	public static void main(String[] args) {
		Bank bank;
		bank= new PNB();
		System.out.println(bank.rateofInterest());

	}

}
