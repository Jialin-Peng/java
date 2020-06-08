import java.util.Scanner;
public class IF {
	public static void main(String[] args) {
		int achievement;
		System.out.print("请输入学生成绩(0-100)：");
		Scanner scanner = new Scanner(System.in);
		achievement = scanner.nextInt();
		if(0<=achievement && achievement<=100){
			if(90<=achievement && achievement<=100)
			System.out.println("该学生的成绩评定等级为A");
			if(80<=achievement && achievement<90)
				System.out.println("该学生的成绩评定等级为B");
			if(70<=achievement && achievement<80)
				System.out.println("该学生的成绩评定等级为C");
			if(60<=achievement && achievement<70)
				System.out.println("该学生的成绩评定等级为D");
			if(0<=achievement && achievement<60)
				System.out.println("该学生的成绩评定等级为E");
		}
		else
			System.out.println("你的输入有错！");
	}
}
