import java.util.Scanner;
public class �Ӽ��˳�
{
	public static void main(String[] args) 
	{
		double n1,n2;
		char n;
		System.out.println("�������������������(��ʽΪ��n1 n2 �����)��");
		Scanner scanner=new Scanner(System.in);
		n1 = scanner.nextDouble();
		n2 = scanner.nextDouble();
		n = scanner.next().charAt(0);
		double num4 = calculator(n1,n2,n);
		System.out.println("��ʽ���Ϊ��"+ num4);
	}
	public static double calculator(double num1,double num2,char op)
		{
			double num3=0;
			if(op=='*')
				num3=num1*num2;
			if(op=='+')
				num3=num1+num2;
			if(op=='/')
				num3=num1/num2;
			if(op=='-')
				num3=num1-num2;
			if(op=='%')
				num3=num1%num2;
			return num3;
		}
}
