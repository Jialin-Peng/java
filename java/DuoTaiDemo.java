/*
面向对象的特征：多态
--定义：某一类事物的多种存在形态。例如，动物中有猫，狗，老鼠，鱼


--猫这个对象对应的类型是猫类型。 猫 c = new 猫();


--同时猫也是动物中的一种，也可以将猫称为动物。 动物 y = new 猫();//只描述一种实体：猫，有两种形态：猫，动物
	----动物是猫，狗，羊等等具体事物中抽取出来的父类型
		父类型的引用指向子类型---代码中的体现


多态的前提：1，必须要有继承或实现的关系
	    2，通常都有覆盖的操作

多态的好处：提高程序的扩展性
多态的弊端：不能够使用子类的特有数据
	
*/

abstract class Animal{
	abstract void eat();

	void method(){
		System.out.println("Animal run......");
	}
}

class Cat extends Animal{
	void eat(){
		System.out.println("猫爱吃鱼！");
	}

	void catchMouse(){
		System.out.println("抓老鼠！");
	}

	/*void method(){
		System.out.println("Cat run......");
	}*/
	
}

class Dog extends Animal{
	void eat(){
		System.out.println("狗吃骨头！");
	}
	
	void lookHome(){
		System.out.println("看家");
	}
}

class DuoTaiDemo{
	public static void main(String[] args){
		/*Cat c = new Cat();

		c.eat();
		c.catchMouse();*/

		Animal an = new Cat();//Animal这个父类的引用指向了Cat子类型的对象//多态体现
		//向上转型（类型提升），子类对象提升为了父类型
		/*
			提升的好处：提高了扩展性，隐藏了子类型
			提升的局限性：只能使用父类中的方法，如果有子类有覆盖的话，运行的是子类型中的内容
		*/
		
		an.eat();
		//an.catchMouse();//编译错误
		/*
			错误: 找不到符号
                an.catchMouse();
                  ^
  		符号:   方法 catchMouse()
 		 位置: 类型为Animal的变量 an
		*/

		an.method();


		//Cat cc = (Cat)an;//向下转型（强制类型转换）,好处：可以使用具体子类型的特有方法
		/*
			向下转型需注意：父类型向下转成子类型，因为子类型不唯一，所以需要进行判断。
			多态的类型判断关键字：instanceof
			格式：对象 instanceof 类or接口
		*/

		if (an instanceof Cat){
			Cat cc = (Cat)an;
			cc.catchMouse();
		}
		else{
			System.out.println("出错啦！！！！");
		}

		//cc.catchMouse();

		//cc.lookHome();

		/*Animal an1 = new Dog();
		an1.eat();

		Dog  dd = (Dog)an1;
		dd.lookHome();*/
	}
}