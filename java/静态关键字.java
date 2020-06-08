/*
static关键字

static用来修饰成员（成员变量，成员方法）:被static修饰的内容可以被所有对象共享
static修饰成员变量：这个变量称为静态变量，类变量
static修饰成员方法：这个方法称为静态方法

被static修饰后的成员有什么特点：
1，随着类的加载而加载的，随着类的消失而消失。生命周期过长
2，优先于对象存在的
3，被所有对象共享
4，可以直接被类名调用

注：
1，静态方法只能访问静态成员，非静态方法既可以访问静态成员，也可以访问非静态成员
2，静态方法中不能够使用this,super这些关键字
3，主函数是静态的

什么情况下使用静态？
静态变量:当类中的属性数据是所有对象共享的
静态方法：当方法中没有访问过非静态数据时，该方法使用static来修饰

成员变量和静态变量的区别？
1，生命周期不同
成员变量（实例变量），随着对象的出现而出现，随着对象的消失而消失
静态变量随着类的加载而加载的，随着类的消失而消失
2，内存中的存储位置不同
成员变量存放在堆内存的对象中
静态变量存放在方法区的静态区（共享区）中
3，存储的数据特点不同
成员变量存储的是对象的特有数据
静态变量存储的是对象的共享数据
4，调用方式不同
成员变量只能通过对象来调用
静态变量既可以被对象调用，也可以通过类名直接调用
*/

class Person{
	static String country;
	String name;
	int age;

	static void show(){//静态方法
		System.out.println("country="+this.country);
		//System.out.println("name="+name);
		//System.out.println("age"+age);//静态方法中不能访问非静态成员
	}

	void method(){//非静态方法
		System.out.println("country="+country);
		System.out.println("name="+name);
		System.out.println("age"+age);
	}
}

class PersonDemo{
	public static void main(String []args){
		Person p1 = new Person();

		/*p1.show();*/

		Person.show();

		p1.method();
		/*p1.country = "EN";
		System.out.println("更改前：p1="+Person.country);

		Person p2 = new Person();
		p2.country = "CN";


		System.out.println("更改后：p1="+Person.country+"\tp2.country="+Person.country);*/
	}
}