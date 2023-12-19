package Homework;

import java.util.*;

public class Homework_Day_5_BT3_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhân viên trong công ty: ");
        int soNhanVien = scanner.nextInt();
        Homework_Day_5_BT3_Employee[] nhanVien = new Homework_Day_5_BT3_Employee[soNhanVien];
         
        System.out.println("Nhập thông tin cho nhân viên");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ": ");
            System.out.print("Chọn loại nhân viên (1 - Developer, 2 - Tester, 3 - BA): ");
            int choose = scanner.nextInt();
             
            if (choose == 1) {
                nhanVien[i] = new Homework_Day_5_BT3_Developer();
            } 
            if (choose == 2) {
                nhanVien[i] = new Homework_Day_5_BT3_Tester();
            } 
            else if (choose == 3) {
            	nhanVien[i] = new Homework_Day_5_BT3_BA();
            }
             
            nhanVien[i].nhapInfo();
        }
         
        System.out.println("Thông tin của các nhân viên trong công ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println((i + 1) + ". " + nhanVien[i].printInfo());
        }

	}

}
