package Homework;

public class Homework_Day_5_BT1_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework_Day_5_BT1_HinhTron hinhtron = new Homework_Day_5_BT1_HinhTron();
		hinhtron.setTenHinh("Hình tròn NEW");
		hinhtron.banKinh = 3;
		System.out.println("Diện tích " + hinhtron.getTenHinh() + ": " + hinhtron.tinhDienTich());
		
		Homework_Day_5_BT1_HinhVuong hinhvuong = new Homework_Day_5_BT1_HinhVuong();
		hinhvuong.setTenHinh("Hình vuông NEW");
		hinhvuong.chieuDaiMotCanh = 5;
		System.out.println("Diện tích " + hinhvuong.getTenHinh() + ": " + hinhvuong.tinhDienTich());
		

	}

}
