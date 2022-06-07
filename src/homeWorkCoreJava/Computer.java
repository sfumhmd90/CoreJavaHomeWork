package homeWorkCoreJava;

public class Computer {
public String brand;
public String model;
public String operatingSystem;
public double price;
public char grade;
public boolean madeInUsa;

public Computer() {
	System.out.println(" this is a default constructor from Computer class");
}
public Computer(String brand, String model, String operatingS, double price, char grade, boolean madeInusa) {
	this.brand= brand;
	this.model=model;
	this.operatingSystem= operatingS;
	this.price= price;
	this.grade= grade;
	this.madeInUsa= madeInUsa;
	System.out.println(" My Brand: " +brand + ", Model: " +model+ ", Operating system: " + operatingS+", Price: "+ price+ ", Grade: " +grade+",  Made in USA? " +madeInUsa);
}
	public Computer(String brand, String model, String operating, char grade) {
		System.out.println(" the brand of this computer is "+ brand+ ", the model is "+ model+", the operating system "+ operatingSystem+ ", grade is "+ grade);
	}
	public Computer(String brand, String model, double price) {
		System.out.println("computer brand is"+ brand+ ", model of computer"+model+", costs around "+price);
	}
}
