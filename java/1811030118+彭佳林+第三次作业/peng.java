import java.util.Scanner;
class Rectangle
{
	private double len;
	private double width;
	Rectangle()
	{
		len=0;
		width=0;
	}
	Rectangle(double len,double width)
	{
		this.len=len;
		this.width=width;
	}
	void getLen()
	{
		System.out.print("矩形长为："+len+"\n");
	}
	void setLen(){
		System.out.print("请输入矩形的长：");
		Scanner lenth=new Scanner(System.in);
		double i=lenth.nextDouble();
		len=i;
	}
	void getWidth()
	{
		System.out.print("矩形宽为："+width+"\n");
	}
	void setWidth(){
		System.out.print("请输入矩形的宽：");
		Scanner width1=new Scanner(System.in);
		double j=width1.nextDouble();
		width=j;
	}
	double getArea()
	{
		double s=len*width;
		return s;
	}
	double getPerimeter()
	{
		double c=2*(len+width);
		return c;
	}
	void show()
	{
		double s=getArea();
		double c=getPerimeter();
		System.out.print("矩形的面积为："+s+"\n");
		System.out.print("矩形的周长为："+c+"\n");
	}
}
public class peng
{
	public static void main(String[] args) 
	{
		Rectangle p1=new Rectangle(10,20);
		p1.getLen();
		p1.getWidth();
		p1.show();
		p1.setLen();
		p1.setWidth();
		p1.getLen();
		p1.getWidth();
		p1.show();
	}
}
