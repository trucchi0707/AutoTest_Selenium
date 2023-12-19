package Homework;

public class Homework_Day_5_BT3_BA extends Homework_Day_5_BT3_Employee{

	int sonamkinhnghiem;

	public int getSonamkinhnghiem() {
		return sonamkinhnghiem;
	}

	public void setSonamkinhnghiem(int sonamkinhnghiem) {
		this.sonamkinhnghiem = sonamkinhnghiem;
	}

	public Homework_Day_5_BT3_BA() {
		// TODO Auto-generated constructor stub
	}
	
	public void nhapInfo() {
		super.nhapInfo();
        System.out.print("Nhập số năm kinh nghiệm BA: ");
        sonamkinhnghiem = scanner.nextInt();
	}
	public String printInfo() {
		return super.printInfo() + "; Số năm kinh nghiệm BA: " + this.sonamkinhnghiem;
		
	}

}
