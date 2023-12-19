package Lesson;

public class Day5_AppShape_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day5_Square square = new Day5_Square();
		square.draw();
		
		Day5_Circle circle = new Day5_Circle();
		circle.draw();
		
		System.out.println("Đa hình: ");
		
		Day5_Shape hVuong = new Day5_Square();
		hVuong.draw();
		Day5_Shape hTron = new Day5_Square();
		hTron.draw();

	}

}
