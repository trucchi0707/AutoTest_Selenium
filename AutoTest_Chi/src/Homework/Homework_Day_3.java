package Homework;
import java.util.*;

public class Homework_Day_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oderArrayBubbleSortDecrease();
		divisible();

	}
	public static void oderArrayBubbleSortDecrease() {
		int n;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Nhập vào số phần tử của mảng: ");
			n = sc.nextInt();
		} while (n < 0);
		
		int arrayNumber[] = new int[n];
		System.out.println("\nNhập các phần tử cho mảng: ");
		for (int i = 0; i <n ; i++) {
			System.out.print("Nhập phần tử thứ " + i + " : ");
			arrayNumber[i] = sc.nextInt();
		}
		
		System.out.print("\nMảng ban đầu là: ");
		for (int i = 0; i < n; i++)
			System.out.print(arrayNumber[i] + "\t");
		
		
		for(int i = 0; i < arrayNumber.length - 1; i++) {
			//System.out.println("Index i: " + i);
			//System.out.println("Value theo i: " + arrayNumber[i]);
			for (int j = 0; j < arrayNumber.length - i - 1; j++) {
				if (arrayNumber[j] < arrayNumber[j + 1]) {
					int temp = arrayNumber[j];
					arrayNumber[j] = arrayNumber[j + 1];
					arrayNumber[j + 1] = temp;
				}
			}
		}
		System.out.print("\nMảng sau khi sắp xếp là: ");
		for (int i = 0; i < arrayNumber.length; i++) {
			System.out.print(arrayNumber[i] + "\t");
		}
		System.out.println();
	}
	public static void divisible() {
		int n;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Nhập vào số phần tử của mảng: ");
			n = sc.nextInt();
		} while (n < 0);
		
		int arrayNumber[] = new int[n];
		System.out.println("\nNhập các phần tử cho mảng: ");
		for (int i = 0; i <n ; i++) {
			System.out.print("Nhập phần tử thứ " + i + " : ");
			arrayNumber[i] = sc.nextInt();
			if (arrayNumber[i] % 2 == 0 && arrayNumber[i] % 3 == 0) {
				System.out.println("Điều kiện thoát xảy ra!");
				break;
			}
		}

	}

}
