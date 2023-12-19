package Lesson;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oderArrayBubbleSortIncrease();
		oderArrayBubbleSortDecrease();

	}
	public static void oderArrayBubbleSortIncrease() {
		// Datatype [] tenbien = {1,1,2,0,0.146565,422};
		int [] arrayNumber = {5,3,8,4,6,2};
		
		for(int i = 0; i < arrayNumber.length - 1; i++) {
			//System.out.println("Index i: " + i);
			//System.out.println("Value theo i: " + arrayNumber[i]);
			for (int j = 0; j < arrayNumber.length - i - 1; j++) {
				if (arrayNumber[j] > arrayNumber[j + 1]) {
					int temp = arrayNumber[j];
					arrayNumber[j] = arrayNumber[j + 1];
					arrayNumber[j + 1] = temp;
				}
			}
		}
		System.out.print("Mảng sau khi sắp xếp là: ");
		for (int i = 0; i < arrayNumber.length; i++) {
		System.out.print(arrayNumber[i]);
		}
		System.out.println();
	}
	public static void oderArrayBubbleSortDecrease() {
		// Datatype [] tenbien = {1,1,2,0,0.146565,422};
		int [] arrayNumber = {5,3,8,4,6,2};
		
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
		System.out.print("Mảng sau khi sắp xếp là: ");
		for (int i = 0; i < arrayNumber.length; i++) {
		System.out.print(arrayNumber[i]);
		}
		System.out.println();
	}
}
