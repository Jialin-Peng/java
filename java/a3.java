import java.util.Scanner;
public class a3 {
	public static void main(String[] args) {
		String name;
		int worktime,hourmoney; 
		double taxrate,salary;
		System.out.println("������Ա��������");
		Scanner scanner1 = new Scanner(System.in);
		name = scanner1.next();
		System.out.println("������ÿ�칤��Сʱ����");
		Scanner scanner2 = new Scanner(System.in);
		worktime = scanner2.nextInt();
		System.out.println("������ÿСʱ���");
		Scanner scanner3 = new Scanner(System.in);
		hourmoney = scanner3.nextInt();
		System.out.println("�������������˰��");
		Scanner scanner4 = new Scanner(System.in);
		taxrate = scanner4.nextDouble();
		salary = ((hourmoney*worktime)*22-((hourmoney*worktime)*22*taxrate));
		String salary1 = String.format("%.2f", salary);
		System.out.println(name +"����нΪ�� " + salary1 +"\n");
	}
}

