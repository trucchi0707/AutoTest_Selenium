package Lesson;

import java.util.*;
import java.io.*;

public class Person {
	
	static String className="K11";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printInfo();
		printLargerNumber(10,20);
		printScannerNumber();
	}
	
	public static void printInfo() {
		System.out.println("This is the first Java project");
		System.out.println("Name: Tran Thi Truc Chi");
		className = "K12";
		System.out.println("Email: trucchi0707@gmail.com");
		System.out.println("Phone number: 0123456789");
	}
	
	public static void printLargerNumber(int number1, int number2) {
		if (number1 > number2) {
			System.out.println("So lon hon la: "+number1);
		}
		else {
			System.out.println("So lon hon la: "+number2);
		}
	}
	
	public static void printScannerNumber() {
		int number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		number1 = sc.nextInt();
		System.out.println("Nhap so thu hai: ");
		number2 = sc.nextInt();
		printLargerNumber(number1,number2);
	}
	
}
