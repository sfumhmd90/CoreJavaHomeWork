package hw5Q3Constructor;

public class Student {
public String stName;
public int stID;
public char sex;
public boolean isProgrammer;
public float grade;

public Student() {
	System.out.println(" this default constructor is from Student class");
}

public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
	
	this.stName = stName;
	this.stID = stID;
	this.sex = sex;
	this.isProgrammer = isProgrammer;
	this.grade = grade;
	System.out.println(" student name: "+stName+" ,student id: "+stID+" ,student sex "+ " is the student a programmer?" + isProgrammer+" ,student grade: "+ grade);
	
}
}
