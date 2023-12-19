package Lesson;

public class Day4_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day4_Animal dogAnimal = new Day4_Animal();
		dogAnimal.name = "Lu lu";
		dogAnimal.age = 2;
		dogAnimal.color = "White";
		dogAnimal.size = 5;
		dogAnimal.setVoice("Go go");
		dogAnimal.getInfo();
		Day4_Animal catAnimal = new Day4_Animal();
		catAnimal.name = "Miu Miu";
		catAnimal.age = 2;
		catAnimal.color = "White";
		catAnimal.size = 5;
		catAnimal.setVoice("Meow Meow");
		catAnimal.getInfo();
	}

}
