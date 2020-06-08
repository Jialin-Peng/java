import java.util.Scanner;
abstract class Graphics
{
	abstract double getVolume();//������������
}

class Sphere extends Graphics
{//������
	private double radius;//����İ뾶
	Sphere(double radius)//���췽��
	{
		this.radius=radius;
	}

	double getRadius()//�洢������getXXX��setXXX����
	{
		return radius;
	}
	void setRadius(double radius)
	{
		this.radius=radius;
	}

	double getVolume()//������������
	{
		double v=(4*Math.PI*radius*radius*radius)/3;
		System.out.println("�������Ϊ"+v);
		return v;
	}

}

class Cuboid extends Graphics
{
	private double len;//��
	private double width;//��
	private double height;//��

	Cuboid(double len,double width,double height)//���췽��
	{
		this.len=len;
		this.width=width;
		this.height=height;
	}

	double getLen()//����ߵ�getXXX��setXXX����
	{
		return len;
	}
	double getWidth()
	{
		return width;
	}
	double getHeight()
	{
		return height;
	}
	void setLen(double len)
	{
		this.len=len;
	}
	void setWidth(double width)
	{
		this.width=width;
	}
	void setHeight(double height)
	{
		this.height=height;
	}

	double getVolume()//���㳤��������
	{
		double v=len*width*height;
		System.out.println("���������Ϊ"+v);
		return v;
	}
}

class Cylinder extends Graphics{
	private double r;//����Բ�İ뾶
	private double h;//��
		
	Cylinder(double r,double h)//���췽��
	{
		this.r=r;
		this.h=h;
	}
		
	double getR()//�뾶�͸ߵ�getXXX��setXXX����
	{
		return r;
	}
	double getH()
	{
		return h;
	}
	void setR(double r)
	{
		this.r=r;
	}
	void setH(double h)
	{
		this.h=h;
	}
	double getVolume()//����Բ��������
	{
		double v=Math.PI*r*r*h;
		System.out.println("Բ�������Ϊ"+v);
		return v;
	}
}

public class testDemo
{
	public static void main(String[] args) 
	{
		Graphics g1=new Sphere(2);
		Graphics g2=new Cuboid(2,3,4);
		Graphics g3=new Cylinder(2,3);
		System.out.println("����1�����壩��2�������壩��3��Բ���壩�����Ӧ��������");
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		switch(i)
		{
			case 1:get(g1);break;
			case 2:get(g2);break;
			case 3:get(g3);
		}
	}
	static double get(Graphics g)
	{
		return g.getVolume();
	}
}
