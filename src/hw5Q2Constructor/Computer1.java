package hw5Q2Constructor;

public class Computer1 {
	
		public String brand;
		public String model;
		public String operatingSystem;
		public double price;
		public char grade;
		public boolean madeInUsa;

		public Computer1() {
			System.out.println("this is default constructor from Computer1 class");
		}
		
		public Computer1(String brand, String model, String operatingSystem, double price, char grade, boolean madeInUsa) {
			this.brand=brand;
			this.model=model;
			this.operatingSystem=operatingSystem;
			this.price=price;
			this.grade=grade;
			this.madeInUsa=madeInUsa;
			System.out.println("the computer brand is "+brand+" the model of the computer is"+model+" the operating system is"+operatingSystem+" price is $ "+price+" the grade is: "+grade+" made in usa? "+madeInUsa);
		}
		public Computer1(String brand, char grade, boolean madeInUsa) {
			this.brand=brand;
			this.grade=grade;
			this.madeInUsa=madeInUsa;
			System.out.println("the computer brand is"+ brand+"Grade of the computer is"+grade+"is it made in the usa?"+madeInUsa);
			
		}
		
		public Computer1(String model, String brand, char grade) {
			this.model=model;
			this.brand=brand;
			this.grade=grade;
			System.out.println("this brand is"+brand+"the model is"+model+"the grade is "+grade);
		}
	}


