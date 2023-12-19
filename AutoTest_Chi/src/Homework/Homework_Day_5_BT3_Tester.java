package Homework;

public class Homework_Day_5_BT3_Tester extends Homework_Day_5_BT3_Employee{
	

	int sonamkinhnghiem;

	public int getSonamkinhnghiem() {
		return sonamkinhnghiem;
	}

	public void setSonamkinhnghiem(int sonamkinhnghiem) {
		this.sonamkinhnghiem = sonamkinhnghiem;
	}

	public Homework_Day_5_BT3_Tester() {
		// TODO Auto-generated constructor stub
	}
	public void nhapInfo() {
		super.nhapInfo();
        System.out.print("Nhập số năm kinh nghiệm Test: ");
        sonamkinhnghiem = scanner.nextInt();
	}
	public String printInfo() {
		return super.printInfo() + "; Số năm kinh nghiệm Test: " + this.sonamkinhnghiem;
		
	}

}
