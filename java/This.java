/*
this关键字：代表其所在函数所属对象的引用。代表的是对象，实际是这个对象的引用
哪个对象调用了this所在的函数，this就代表哪个对象
this用法一：当成员变量和局部变量同名时，用this来区分
this用法二：使用this(参数列表)的方式实现构造方法之间的调用。
注：构造方法之间调用时，this语句只能定义在构造方法的第一行。
*/

class Person2{//默认构造方法为Person1(){}
	private String name;
	private int age;

	Person2(){
		System.out.println("Person运行了。");
	}
	
	Person2(String n){
		name = n;
		System.out.println("name赋值");
	}

	Person2(int a){
		age = a;
		System.out.println("age赋值");
	}

	Person2(String name, int age){
		this(name);//必须是第一行
		this.age = age;
		
		System.out.println("name和age赋值");
	}

	void show(){
		System.out.println("name="+name+",age="+age);
	}
}

class PersonDemo2{
	public static void main(String[] args)
	{
		//new Person2();//匿名对象
		//Person2 p = new Person1();
		//Person2 p1 = new Person1("lily");
		Person2 p2 = new Person2("Lucy", 23);
		p2.show();
		p2.show();
	}
}