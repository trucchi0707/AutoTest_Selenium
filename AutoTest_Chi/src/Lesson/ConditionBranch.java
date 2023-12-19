package Lesson;

public class ConditionBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practiceIfElse(10,15);
		appendString("Monday","Test");
		appendString("Monday","Test","ABC");

	}
	
	public static void practiceIfElse(int number1, int number2) {
		int resultp = 0;
		if (number1 > 10 && number2 > 10) {
			resultp = number1 * number2 * 5;
		} 
		else if (number1 < 10 && number2 > 10) {
			resultp = number1 * number2 * 5;
		}
		else {
			if (number1 <= 10 && number2 <= 10) {
			resultp = number1 * number2;
			}
		}
		System.out.println("Ket qua: " + resultp);
	}
	public static double practiceIfElse(double number1, int number2) {
		double resultp = 0;
		if (number1 > 10 && number2 > 10) {
			resultp = number1 * number2 * 5;
		} 
		else if (number1 < 10 && number2 > 10) {
			resultp = number1 * number2 * 5;
		}
		else {
			if (number1 <= 10 && number2 <= 10) {
			resultp = number1 * number2;
			}
		}
		return resultp;
	}
	public static String appendString(String str1, String str2) {
		String apendText = "";
		apendText = str1 + str2;
		return apendText;
	}
	public static String appendString(String day, String str2, String str3) {
		String apendText = "";
		
		switch (day) {
		case "Monday": {
			apendText = "Monday is 1 in week: " + str2 + str3;
			break;
			}
		case "Tuesday": {
			apendText = "Tuesday is 2 in week: " + str2 + str3;
			break;
			}
		case "Wednesday": {
			apendText = "Wednesday is 3 in week: " + str2 + str3;
			break;
			}
		case "Thursday": {
			apendText = "Thursday is 4 in week: " + str2 + str3;
			break;
			}
		case "Friday": {
			apendText = "Friday is 5 in week: " + str2 + str3;
			break;
			}
		case "Saturday": {
			apendText = "Saturday is 6 in week: " + str2 + str3;
			break;
			}
		case "Sunday": {
			apendText = "Sunday is 7 in week: " + str2 + str3;
			break;
			}
		default: 
			apendText = "Unpexpected value: Ngày không hợp lệ" + day;
		}
		return apendText;
	}
}
