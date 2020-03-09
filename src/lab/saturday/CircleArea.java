package lab.saturday;
import java.util.*;
public class CircleArea {

	
	public static void main(String[] args) {
		//declare double radius,PI, area
		double radius;
		final double PI = 3.14;
		double area;
		
		//declare a variable of type Scanner
		Scanner sc;
		//create an object of type Scanner to take input via keyboard
		sc = new Scanner (System.in);
		
		//input
		System.out. println("Please enter radius are: ");
		radius = sc.nextDouble();
		//processing
		area = PI * radius * radius;
		//output
		System.out.println("The area of a circle with radius " + radius + " is: " + area);
	}

}
