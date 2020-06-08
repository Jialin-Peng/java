import java.util.Scanner;
class Rectangle
{
	private double len;//������� ��
	private double width;//������� ��
	Rectangle()//�޲ι��췽��
	{
		len=0;
		width=0;
	}
	Rectangle(double len,double width)//�����������Ĺ��췽��
	{
		this.len=len;
		this.width=width;
	}
	double getLen()//��ȡ ��
	{
		double len1=len;
		System.out.print("��Ϊ��"+len+"\n");
		return len1;
	}
	void setLen()//���� ��
	{
		System.out.print("�����볤��");
		Scanner lenth=new Scanner(System.in);
		double i=lenth.nextDouble();
		len=i;
	}
	double getWidth()//��ȡ ��
	{
		double width2=width;
		System.out.print("��Ϊ��"+width+"\n");
		return width2;
	}
	void setWidth()//���� ��
	{
		System.out.print("�������");
		Scanner width1=new Scanner(System.in);
		double j=width1.nextDouble();
		width=j;
	}
	double getArea()//����������
	{
		double s=len*width;
		return s;
	}
	double getPerimeter()//��������ܳ�
	{
		double c=2*(len+width);
		return c;
	}
}
class Cuboid extends Rectangle
{
	private double height;
	Cuboid()//�޲ι��췽��
	{
		super();
		height=0;
	}
	Cuboid(double len,double width,double height)//�������������Ĺ��췽��
	{
		super(len,width);
		this.height=height;
	}
	void getHeight()//��ȡ ��
	{
		System.out.print("��Ϊ��"+height+"\n");
	}
	void setHeight()//���� ��
	{
		System.out.print("������ߣ�");
		Scanner height1=new Scanner(System.in);
		double k=height1.nextDouble();
		height=k;
	}
	double getCuboidVolume()//���㳤�������
	{
		double v=getArea()*height;
		return v;
	}
	double getCuboidArea()//���㳤��������
	{
		double s=2*(getArea()+getLen()*height+height*getWidth());
		return s;
	}
	double getCuboidPerimeter()//���㳤�����ⳤ��
	{
		double c=2*(getPerimeter()+2*height);
		return c;
	}
	void show()
	{
		double v=getCuboidVolume();
		double s=getCuboidArea();
		double c=getCuboidPerimeter();
		getHeight();
		System.out.print("���Ϊ��"+v+"\n");
		System.out.print("�����Ϊ��"+s+"\n");
		System.out.print("�ⳤ��Ϊ��"+c+"\n");

	}
}
public class Test
{
	public static void main(String[] args) 
	{
		Cuboid c1=new Cuboid(10,20,5);
		c1.show();
	}
}