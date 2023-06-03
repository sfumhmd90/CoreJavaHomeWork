package hw5Q3Constructor;

public class MySelf {

	public String name;
	public int age;
    public short salary;
    public long BankBalance;
    public float height;
    public double grade;
    public boolean citizen;
    public char sex;
    
    public MySelf() {
    	System.out.println("this is a constructor from myself class");
    }
    
    public void EmpInfo () {
    	System.out.println("\n my name is "+ name + "\n my age is "+ age + "\n my salary is"+ salary+"\n my bank balance is "+ BankBalance + "\n citizen status:"+ citizen + "i love to code");
    }
}
