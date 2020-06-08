import java.util.Scanner;
public class 两个数
{
	public static void main(String[] args) 
	{
		int a,b;
		double x,y;
		System.out.print("请输入两个整数：");
		Scanner scanner=new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println("两个整数中较大的数为："+ max(a,b));
		System.out.print("请输入两个浮点数：");
		Scanner scanner2=new Scanner(System.in);
		x = scanner2.nextDouble();
		y = scanner2.nextDouble();
		System.out.println("两个整数中较大的数为："+ max(x,y));
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
