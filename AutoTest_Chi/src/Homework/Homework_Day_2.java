package Homework;

import java.util.*;

public class Homework_Day_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculateNumber(1123,6745,500);
		printLargerNumber();
	}
	
	public static void calculateNumber(int number1, int number2, int number3) {
		double result = (number1 * number2) / number3;
		System.out.println("Ket qua la: " + result);
		}
	
	
	public static void printLargerNumber() {
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		number1 = sc.nextInt();
		System.out.println("Nhap so thu hai: ");
		number2 = sc.nextInt();
		if (number1 > number2) {
			System.out.println("So lon hon la: " + number1);
		}
		else {
			System.out.println("So lon hon la: " + number2);
		}
	}

}
