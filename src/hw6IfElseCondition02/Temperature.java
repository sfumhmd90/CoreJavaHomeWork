package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println(" Today's Weather");
		Scanner scanner = new Scanner(System.in);
		int todaysTemp = scanner.nextInt();
		if(todaysTemp<32) {
			System.out.println("Freezing");
		}else if (todaysTemp<55) {
			System.out.println("pleasant");
		}else if (todaysTemp<73) {
			System.out.println("getting warmer");
		}else if (todaysTemp>101) {
			System.out.println("very hot");
		}else { System.out.println("please put a valid temperature");
	
	scanner.close();
		
	}
}
}
