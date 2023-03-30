package packageeg;

public class Static_Area_Peremeter
{
	
	int side; // non static variable
	

 double Area() 
{
	return side * side;
	
}
double perimeter() 
{
	
	return 4 * side;
	
}
static void display(double area, double perimeter)  // static method to print results
{
    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
}
public static void main(String[] args) 
{
    // create a new Square object
	Static_Area_Peremeter sq = new Static_Area_Peremeter();
    sq.side = 5;
    
 // calculate area and perimeter
    double area = sq.Area();
    double perimeter = sq.perimeter();
    
    Static_Area_Peremeter.display(area, perimeter);  // print results using static method
}
}

