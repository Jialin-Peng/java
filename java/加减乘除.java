import java.util.Scanner;
public class 加减乘除
{
	public static void main(String[] args) 
	{
		double n1,n2;
		char n;
		System.out.println("请输入两个数和运算符(格式为：n1 n2 运算符)：");
		Scanner scanner=new Scanner(System.in);
		n1 = scanner.nextDouble();
		n2 = scanner.nextDouble();
		n = scanner.next().charAt(0);
		double num4 = calculator(n1,n2,n);
		System.out.println("该式结果为："+ num4);
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
