import java.util.Scanner;
class Rectangle
{
	private double len;//定义变量 长
	private double width;//定义变量 宽
	Rectangle()//无参构造方法
	{
		len=0;
		width=0;
	}
	Rectangle(double len,double width)//带两个参数的构造方法
	{
		this.len=len;
		this.width=width;
	}
	double getLen()//获取 长
	{
		double len1=len;
		System.out.print("长为："+len+"\n");
		return len1;
	}
	void setLen()//设置 长
	{
		System.out.print("请输入长：");
		Scanner lenth=new Scanner(System.in);
		double i=lenth.nextDouble();
		len=i;
	}
	double getWidth()//获取 宽
	{
		double width2=width;
		System.out.print("宽为："+width+"\n");
		return width2;
	}
	void setWidth()//设置 宽
	{
		System.out.print("请输入宽：");
		Scanner width1=new Scanner(System.in);
		double j=width1.nextDouble();
		width=j;
	}
	double getArea()//计算矩形面积
	{
		double s=len*width;
		return s;
	}
	double getPerimeter()//计算矩形周长
	{
		double c=2*(len+width);
		return c;
	}
}
class Cuboid extends Rectangle
{
	private double height;
	Cuboid()//无参构造方法
	{
		super();
		height=0;
	}
	Cuboid(double len,double width,double height)//带有三个参数的构造方法
	{
		super(len,width);
		this.height=height;
	}
	void getHeight()//获取 高
	{
		System.out.print("高为："+height+"\n");
	}
	void setHeight()//设置 高
	{
		System.out.print("请输入高：");
		Scanner height1=new Scanner(System.in);
		double k=height1.nextDouble();
		height=k;
	}
	double getCuboidVolume()//计算长方体体积
	{
		double v=getArea()*height;
		return v;
	}
	double getCuboidArea()//计算长方体表面积
	{
		double s=2*(getArea()+getLen()*height+height*getWidth());
		return s;
	}
	double getCuboidPerimeter()//计算长方体棱长和
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
		System.out.print("体积为："+v+"\n");
		System.out.print("表面积为："+s+"\n");
		System.out.print("棱长和为："+c+"\n");

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