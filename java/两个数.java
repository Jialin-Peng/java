import java.util.Scanner;
public class ������
{
	public static void main(String[] args) 
	{
		int a,b;
		double x,y;
		System.out.print("����������������");
		Scanner scanner=new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println("���������нϴ����Ϊ��"+ max(a,b));
		System.out.print("������������������");
		Scanner scanner2=new Scanner(System.in);
		x = scanner2.nextDouble();
		y = scanner2.nextDouble();
		System.out.println("���������нϴ����Ϊ��"+ max(x,y));
	}
	public static int max(int m,int n)
	{
		int t;
		if(m<n)
		{
			t=m;
			m=n;
			n=t;
		}
		return m;
	}
	public static double max(double m,double n)
	{
		double t;
		if(m<n)
		{
			t=m;
			m=n;
			n=t;
		}
		return m;
	}
}
