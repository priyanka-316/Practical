package method;

import java.util.Scanner;

public class User_Defined_ex2 {

	public static void positive_or_not(int num) {
		
		if(num>0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
	}
	
	public static void main(String[] args) {
		
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number:-");
  int num = sc.nextInt();
  positive_or_not(num);
	}

}
