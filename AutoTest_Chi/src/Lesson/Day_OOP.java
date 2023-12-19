package Lesson;

public class Day_OOP {
	
	static int x;
	
	public static void setValue (int number) {
		x = number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ví dụ lập trình hướng đối tượng");
		Day_OOP attribute = new Day_OOP();
		attribute.x=100;
		System.out.println("x: " + attribute.x);
		attribute.setValue(20);
		System.out.println("x với hàm setValue " + attribute.x);

	}

}
