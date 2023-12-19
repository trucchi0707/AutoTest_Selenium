package Homework;

public class Homework_Day_5_BT2 {
	
	public double tinhluong(int luongcoban, float hesoluong) {
		return luongcoban * hesoluong;
	}
	
	public double tinhluong(int luongcoban, float hesoluong, int sonamkinhnghiem) {
		return luongcoban * hesoluong * sonamkinhnghiem;
	}

	public double tinhluong(int luongcoban, float hesoluong, int sonamkinhnghiem, int loai) {
		double luong = 0;
		if (loai == 1)
			return luong = luongcoban * hesoluong * sonamkinhnghiem * 0.2;
		if (loai == 2)
			return luong = luongcoban * hesoluong * sonamkinhnghiem * 0.45;
		return luong;
	}

	


}
