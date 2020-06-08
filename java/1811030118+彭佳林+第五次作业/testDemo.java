import java.util.Scanner;
abstract class Graphics
{
	abstract double getVolume();//返回物体的体积
}

class Sphere extends Graphics
{//球体类
	private double radius;//球体的半径
	Sphere(double radius)//构造方法
	{
		this.radius=radius;
	}

	double getRadius()//存储器方法getXXX和setXXX方法
	{
		return radius;
	}
	void setRadius(double radius)
	{
		this.radius=radius;
	}

	double getVolume()//计算球体的体积
	{
		double v=(4*Math.PI*radius*radius*radius)/3;
		System.out.println("球体体积为"+v);
		return v;
	}

}

class Cuboid extends Graphics
{
	private double len;//长
	private double width;//宽
	private double height;//高

	Cuboid(double len,double width,double height)//构造方法
	{
		this.len=len;
		this.width=width;
		this.height=height;
	}

	double getLen()//长宽高的getXXX和setXXX方法
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

	double getVolume()//计算长方体的体积
	{
		double v=len*width*height;
		System.out.println("长方体体积为"+v);
		return v;
	}
}

class Cylinder extends Graphics{
	private double r;//底面圆的半径
	private double h;//高
		
	Cylinder(double r,double h)//构造方法
	{
		this.r=r;
		this.h=h;
	}
		
	double getR()//半径和高的getXXX和setXXX方法
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
	double getVolume()//计算圆柱体的体积
	{
		double v=Math.PI*r*r*h;
		System.out.println("圆柱体体积为"+v);
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
		System.out.println("输入1（球体）、2（长方体）、3（圆柱体）获得相应物体的体积");
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
