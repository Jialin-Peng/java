/*
类：对某一个事物的描述
对象：该类事物具体的实体
*/

/*
面向对象有三个特性：封装，继承，多态
封装：隐藏对象的属性和实现细节，仅对外提供公共访问方式。

好处：提高安全性和重用性，便于使用

private:私有的，访问权限是最低的，用private修饰的成员只能够在本类中才能访问，只能修饰成员属性和成员方法，不能修饰局部
public:公有的，访问权限是最高的
封装原则：将不需要对外提供的内容隐藏起来，提供一个公共访问方法

成员属性一般都是定义成私有成员
*/

class Person{//类
	/*
	定义setXXX()和getXXX()对类里的成员属性进行存取操作
	*/

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setAge(int a){
		age = a;
	}

	public int getAge(){
		return age;
	}

	void speak(){//成员方法
		int a;
		System.out.println("name="+name+"\tage="+age);
	}

	private String name;//成员属性，将类中的成员私有化，对外提供方法对其进行访问，目的就是为了对成员数据进行控制，使其具有可控性
	private int age;//成员属性	
}

class PersonDemo{
	public static void main(String[] args){
		//类名 对象名；声明一个对象
		//new 类名();//创建一个对象
		//类名 对象名 = new 类名();
		int a;

		Person p = new Person();//如何调用对象内容呢？对象名.对象成员
		//p就是Person这个类的对象
		//p.name = "lisi";
		//p.age=-30;
		//p.show(30);
		//p.speak();

		p.setName("张三");
		System.out.println(p.getName());
		p.setAge(23);
		System.out.println(p.getAge());
		
/*		Person p1 = new Person();

		method(p);
		method(p1);
		method(new Person());//匿名对象*/
		
	}

/*	public static void method(Person pp){//Person pp = new Person();
		pp.name="zhangsan";
		pp.age=23;
	}*/
}