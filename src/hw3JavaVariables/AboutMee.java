package hw3JavaVariables;

import java.lang.invoke.StringConcatFactory;
import java.security.PublicKey;

public class AboutMee {
public String myName;//variable declared 
public String fullNameString ="saif mahmud";
public String myHome= "brooklyn";
public byte age = 27;
public short myAptRent= 1300;
public int myYearlySalary =450000;
public long myBankBalance =456789045678l;
public float myHeight= 5.7899f;
public double myGrade = 4.00000000;
public char sex ='M';
public boolean vaccinated = true;
	public static void main(String[] args) {
		AboutMee mee = new AboutMee();
		System.out.println(mee.fullNameString);
		System.out.println(mee.age);
		System.out.println(mee.myBankBalance);
		System.out.println("my name is "+ mee.fullNameString + "\ni'm living in " + mee.myHome +"\ni have a yearly salary of "+mee.myYearlySalary);
  String myName ="andy";
  System.out.println(myName);
	}

}
