import java.util.Scanner;
public class IF {
	public static void main(String[] args) {
		int achievement;
		System.out.print("������ѧ���ɼ�(0-100)��");
		Scanner scanner = new Scanner(System.in);
		achievement = scanner.nextInt();
		if(0<=achievement && achievement<=100){
			if(90<=achievement && achievement<=100)
			System.out.println("��ѧ���ĳɼ������ȼ�ΪA");
			if(80<=achievement && achievement<90)
				System.out.println("��ѧ���ĳɼ������ȼ�ΪB");
			if(70<=achievement && achievement<80)
				System.out.println("��ѧ���ĳɼ������ȼ�ΪC");
			if(60<=achievement && achievement<70)
				System.out.println("��ѧ���ĳɼ������ȼ�ΪD");
			if(0<=achievement && achievement<60)
				System.out.println("��ѧ���ĳɼ������ȼ�ΪE");
		}
		else
			System.out.println("��������д�");
	}
}
