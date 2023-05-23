package hw4JavaVariables;

public class AboutMe {
	public String name;
	public int age;
	public short salary;
	public long BankBalance;
	public float height;
	public double grade;
	public boolean citizen;
	public char sex;

// constructor declared
	public AboutMe() { // constructor declared
		System.out.println("This is all about me");
	}

	public void aboutMe() { // method implemented
		System.out.println("\n my name is " + name + "\n my age is " + age + "\n my earn a yealy salary of " + salary
				+ " \n i have savings of " + BankBalance + " \n my height is " + height + "\n i have a gpa of " + grade
				+ "\n am i a US citizen? " + citizen + "\n my sex is " + sex);
	}
}
