/*
抽象：abstract
类是用来描述事物的，当没有足够的信息去描述一个事物时，这个类就是抽象的

抽象类的特点：
1，抽象方法只有声明，没有方法体
2，抽象方法一定定义抽象类中，都需要被abstract关键字修饰
3，抽象类不可以用new创建对象
4，抽象类必须有自己的子类覆盖了所有的抽象方法之后，该子类才可以被实例化，否则，该子类还是一个抽象类


--------------------------------------------------------------------------------------------------
1，抽象类一定是个父类吗？
是，抽象类并不具体，需要子类将其具体化，并实例化

2，抽象类中有没有构造方法？
有，用来给子类进行对象初始化

3，抽象关键字不可以和哪些关键字共存？
final,prvite, static

	
*/

/*abcstrct class Demo{
	abstrct void method();
}

class DemoA extends Demo{
	void method(){
		System.out.println("Demoa methods");
	}
}

class DemoB extends Demo{
	void method(){
		System.out.println("Demob methods");
	}
}*/

abstract class Animal{
	Animal(){super();}
	abstract void cry();//抽象方法
	abstract void eat();
	abstract void sleep();
}

class Cat extends Animal{
	void cry(){
		System.out.println("喵喵");
	}
	
	void eat(){
		System.out.println("鱼");
	}

	void sleep(){

	}
}

class Dog extends Animal{
	void cry(){
		System.out.println("汪汪");
	}
}

class AbstractDemo{
	public static void main(String[] args){
		//Animal an = new Animal();//错误: Animal是抽象的; 无法实例化
		Cat c = new Cat();
	}
}