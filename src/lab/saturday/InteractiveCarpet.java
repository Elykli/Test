package lab.saturday;
import java.util.*;
/*Follow the Carpet class to create an interactive application. Instead of assigning
values to the length, width and price variables accept them from the user as
input. Save the revised class as InteractiveCarpet.java.
*/

public class InteractiveCarpet {

	
	public static void main(String[] args) {
		
		double length, width, price;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter the length of the carpet ");
		length = sc.nextDouble();
		
		System.out.println("Please enter the width of the carpet ");
		width = sc.nextDouble();
		
		System.out.println("Please enter the price ");
		price = sc.nextDouble();
		
		
		double area, cost;
		area = width * length;
		cost = area * price;
		
		String resultText = " The total cost of our carpet ";
		String costText = "will cost you around:";
		System.out.println(resultText + "width: " + width + "and with length " + length + costText + cost + " EUR");
		
		
	}

}
