class Outer{//内部类的外嵌类
	int num = 3;

	static int num2 = 19;

	/*
		内部类可以直接访问外部类中的成员，包括私有成员，
		外部类要访问内部类的成员必须先建立内部类的对象
	
	*/

	class Inner{//内部类（内置类，嵌套类）：将类定义在另一个类的里面，
		int max = 100;
		void show(){
			System.out.println("num====="+num);
		}
	}

	void method(){
		Inner in = new Inner();
		in.show();
	}


	static class Inner2{
		void show2(){
			System.out.println("show2 num2 === "+ num2);
		}
	}

	static class Inner3{
		static void show3(){
			System.out.println("show3 num2 ===" +num2);
		}
	}
	
	
}

class InnerDemo1{
	public static void main(String[] args){
		//直接访问内部类成员的方式

		//1，对非静态的内部类中的非静态成员访问
		Outer.Inner in = new Outer().new Inner();//创建内部类的对象
		in.show();
		System.out.println("max=="+in.max);

		//2，访问静态内部类中的非静态成员
		Outer.Inner2 in2 = new Outer.Inner2();
		in2.show2();

		//3，访问静态内部类中的静态成员
		Outer.Inner3.show3();
	
	}
}