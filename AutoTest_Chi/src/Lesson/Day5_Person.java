package Lesson;

public class Day5_Person {
	// Bsrn thân mỗi class Contructor
	// Cho phép gọi class với điểu kiện không tham số hoặc tham số truyền vào khi khai báo một opject cho class này
	public Day5_Person(String name, String age1, String color) {
		this.name = name;
		age = age1;			// biến age được hiểu là của class, còn age1 là biến trong hàm public này => không cần dùng this, khi cả 2 biến trùng tên thì dùng this
		this.color = color;
	}
	public Day5_Person() {
		
	}
	String name;
	String age;
	String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
