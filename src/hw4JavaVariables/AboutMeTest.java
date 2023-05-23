package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe saif = new AboutMe(); // constructor initialized
		saif.name = "saif mahmud"; // variables initialized
		saif.age = 32;
		saif.salary = 100;
		saif.BankBalance = 1044440000000l;
		saif.height = 5.78f;
		saif.grade = 3.999;
		saif.citizen = true;
		saif.sex = 'M';
		saif.aboutMe(); // method initialized

		AboutMe alex = new AboutMe();
		alex.name = "alex";
		alex.age = 19;
		alex.salary = 1000;
		alex.BankBalance = 10999999l;
		alex.height = 6.000f;
		alex.grade = 3.809;
		alex.citizen = false;
		alex.sex = 'F';
		alex.aboutMe();
	}

}
