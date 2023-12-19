package Homework;

public class Homework_Day_5_BT2_Application {
	public static void main(String[] args) {

		Homework_Day_5_BT2 salary = new Homework_Day_5_BT2();
		int luongcoban = 19000000;
		System.out.println("Tính lương bác sĩ: ");
		System.out.println(salary.tinhluong(luongcoban, 1));
		System.out.println(salary.tinhluong(luongcoban, 1, 5));
		System.out.println(salary.tinhluong(luongcoban, 1, 5, 2));
	}

}
