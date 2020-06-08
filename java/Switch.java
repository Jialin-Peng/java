import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		String week;
		System.out.print("请输入数字1-7：");
		Scanner scanner = new Scanner(System.in);
		week = scanner.next();
		switch (week) {
		case "1":
			System.out.println("Monday");
			break;
		case "2":
			System.out.println("Tuesday");
			break;
		case "3":
			System.out.println("Wednesday");
			break;
		case "4":
			System.out.println("Thursday");
			break;
		case "5":
			System.out.println("Friday");
			break;
		case "6":
			System.out.println("Saturday ");
			break;
		case "7":
			System.out.println("Sunday ");
			break;
		default:
			System.out.println("你的输入有错！");
		}
	}
}
