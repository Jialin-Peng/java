/*
	匿名内部类：内部类的简化写法
	前提：内部类必须继承一个类或实现一个接口

	格式：
		new 父类名或接口名(){
			定义内部类中主体；
		}
*/

abstract class AbsDemo{
	abstract void function();
	abstract void show();
}

//new Person();//创建了一个Person类的匿名对象

class Outer{
	int num = 10;

	/*class Inner extends AbsDemo{
		void function(){
			System.out.println("num==="+num);
		}
	}


	void method(){
		new Inner().function();
	}*///完整的内部类

	/*
		new X();//创建X的对象
		new X(){}//创建X的子类对象
	*/

	void method(){

		//匿名内部类就相当于上面Inner这个类的简化写法
		AbsDemo a = new AbsDemo(){//创建内部类的对象,new AbsDemo(){主体}，这句话相当于创建了AbsDemo这个类的子类对象
			void function(){
				System.out.println("function num==="+num);
			}
			
			void show(){
				System.out.println("method num==="+num);
			}
		};


		a.function();
		a.show();
	}

}

class InnerDemo2{
	public static void main(String[] args){
		Outer out = new Outer();
		out.method();
	}
}