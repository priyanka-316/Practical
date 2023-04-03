package Inheritance;

class Vehicle //parents class A
{
	void running() {
		System.out.println("Running mode on");
}}
class Car extends Vehicle{
	void run() {
		System.out.println("Car run mode on");
	}
}
class I10 extends Car
{
	void speed() {
		System.out.println("Speed is very high");
	}
}
public class Multilevel_In2 
{
 public static void main(String args[]) {
	 I10 d= new I10();
	 d.running();
	 d.run();
	 d.speed();
 }
}
