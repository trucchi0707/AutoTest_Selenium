package Lesson;

public class Day4_Animal {
	String name;
	String color;
	int age;
	int size;
	String voice;
	private String breed;
	
	public void getInfo() {
		System.out.println("Thông tin: ");
		System.out.println("Tên: " + name);
		System.out.println("Màu: " + color);
		System.out.println("Tuổi: " + age);
		System.out.println("Cân nặng: " + size);
		System.out.println("Voice: " + voice);
		System.out.print("Breed: " + breed);
	}
	public String getInfo1() {
		return "Color: " + color + "Age: " + age + "Size: " + size;
	}
	private void setBreed() {
		breed = "ADDDD";
		breed = "Original / Thuan chung";
	}
	private void getBreed() {
		System.out.println("Original / Thuan chung");
	}
	public void setVoice(String value) {
		voice = value;
	}
	

}
