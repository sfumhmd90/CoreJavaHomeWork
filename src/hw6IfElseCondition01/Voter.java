package hw6IfElseCondition01;

public class Voter {

	public static void main(String[] args) {
		int age = 32;
		if (age == 18) {
			System.out.println("i'm a voter");
		} else if (age < 18) {
			System.out.println("i'am not a voter");
		} else if (age > 18) {
			System.out.println("I am a voter from age 18");
		} else {
			System.out.println("please add a valid age");
		}


	}

}	
