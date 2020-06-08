/*
构造函数（构造方法）
特点：
1.方法名和类名是一模一样的
2.不用定义返回值类型
3.没有具体的返回值
作用：
给对象进行初始化操作


如果一个类中没有定义过构造方法，编译器会给该类添加一个默认的构造方法。类名(){}
一旦在类中有自定义的构造方法时，该默认构造方法就没有了
一个类中构造方法可以有多个，这多个构造方法是以方法重载的形式体现的

构造方法和一般方法有什么区别？
构造方法用于给对象初始化的，初始化动作只能执行一次，一般方法可以被多次执行
*/

class Person1{//默认构造方法为Person1(){}
	private String name;
	private int age;

	Person1(){
		System.out.println("Person运行了。");
	}
	
	Person1(String n){
		name = n;
		System.out.println("name赋值");
	}

	Person1(int a){
		age = a;
		System.out.println("age赋值");
	}

	Person1(String n, int a){
		name = n;
		age = a;

		System.out.println("name和age赋值");
	}

	void show(){
		System.out.println("name="+name+",age="+age);
	}
}

class PersonDemo1{
	public static void main(String[] args)
	{
		//new Person1();//匿名对象
		//Person1 p = new Person1();
		//Person1 p1 = new Person1("lily");
		Person1 p2 = new Person1("Lucy", 23);
		p2.show();
		p2.show();
	}
}