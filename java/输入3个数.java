import java.util.Scanner;
public class ����3���� 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.print("������3��������");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		sort(a,b,c);
	}
	public static void sort(int x,int y,int z) 
	{
		int i;
		if(x<y)
		{
			i=x;
			x=y;
			y=i;
		}
		if(x<z)
		{
			i=x;
			x=z;
			z=i;
		}
		if(y<z)
		{
			i=y;
			y=z;
			z=i;
		}
		System.out.println("��3������������Ϊ"+x+" "+y+" "+z);
	}
}
