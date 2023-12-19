package Lesson;

public class Day5_Employee extends Day5_Person{
	public Day5_Employee(String name, String age1, String color) {
		super(name,age1,color);
		System.out.println("Giá trị của: " + name);
	}
	public Day5_Employee(){
		// TODO Auto-generated constructor stub
	}
	public Day5_Employee(String name) {
		
		System.out.println("Giá trị của: " + name);
	}
	public Day5_Employee(String age1, String color) {
		
		System.out.println("Giá trị của: " + age1);
	}
	
	
	
	String salary;
	String contract_type;
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getContract_type() {
		return contract_type;
	}
	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}

}
