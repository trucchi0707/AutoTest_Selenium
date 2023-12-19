package Homework;

import java.util.*;

public class Homework_Day_5_BT3_Employee {
	
	String maNhanVien, hoTen, phongBan, role;
    double salary;
    
    public String getMaNhanVien() {
        return maNhanVien;
    }
 
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
 
    public String getHoTen() {
        return hoTen;
    }
 
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public String getRole() {
		return role;
	}

	public void setNamsinh(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
     
    public Homework_Day_5_BT3_Employee() {
        super();
    }
 
    public Homework_Day_5_BT3_Employee(String maNhanVien, String hoTen, String phongBan, String role, double salary) {
        
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.phongBan = phongBan;
        this.role = role;
        this.salary = salary;
    }
    
	Scanner scanner = new Scanner(System.in);
	
    public void nhapInfo() {
        System.out.print("Nhập mã nhân viên: ");
        maNhanVien = scanner.nextLine();
        System.out.print("Nhập họ tên nhân viên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập phòng ban: ");
        phongBan = scanner.nextLine();
        System.out.print("Nhập role: ");
        role = scanner.nextLine();
        System.out.print("Nhập lương: ");
        salary = scanner.nextInt();
        
    }
     
    public String printInfo() {
        return "Mã nhân viên: " + this.maNhanVien + "; Họ tên nhân viên: " + this.hoTen +  "; Phòng ban: " + this.phongBan + "; Role: " + this.role + "; Lương: " + this.salary;
    }
}
