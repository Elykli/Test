package lab.saturday;
import java.util.*;
public class Eggs {

	public static void main(String[] args) {
		//declare variables box
		int boxCount, eggsCount, eggsLeftover;
		final int DOZEN = 12;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter number of eggs");
		eggsCount = sc.nextInt();
		
		boxCount = eggsCount / DOZEN;
		System.out.println("Number of boxes needed is: "+ boxCount);
		
		eggsLeftover = eggsCount%DOZEN;
		System.out.println("Number of remaining eggs: "+ eggsLeftover);
		
	}

}
