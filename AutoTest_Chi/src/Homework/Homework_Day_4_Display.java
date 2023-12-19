package Homework;

public class Homework_Day_4_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thông tin xe máy: ");
		Homework_Day_4_Xe XeMay = new Homework_Day_4_Xe();
		XeMay.setTenXe("Vision");
		System.out.println("Tên xe: " + XeMay.getTenXe());
		XeMay.setLoaiXe("Honda");
		System.out.println("Loại xe: " + XeMay.getLoaiXe());
		XeMay.setVanTocMax(80);
		System.out.println("Vận tốc Max: " + XeMay.getVanTocMax());
		
		System.out.println("\nThông tin xe taxi: ");
		Homework_Day_4_Xe XeTaxi = new Homework_Day_4_Xe();
		XeTaxi.setTenXe("BMW");
		System.out.println("Tên xe: " + XeTaxi.getTenXe());
		XeTaxi.setLoaiXe("Ô tô");
		System.out.println("Loại xe: " + XeTaxi.getLoaiXe());
		XeTaxi.setVanTocMax(200);
		System.out.println("Vận tốc Max: " + XeTaxi.getVanTocMax());
		
		
		System.out.println("\nThông tin Developer: ");
		Homework_Day_4_Employee Developer = new Homework_Day_4_Employee();
		Developer.setEmployee_id(10);
		Developer.setEmployee_name("Joke");
		System.out.println("Mã employee: " + Developer.getEmployee_id());
		System.out.println("Tên empoyee: " + Developer.getEmployee_name());
		System.out.println("Không thể set Employee_salary!");
		//Developer.setEmployeeSalary(5000);
		System.out.println("Lương employee: " + Developer.getEmployee_salary());
	}

}
