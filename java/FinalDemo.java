/*

	final:关键字，修饰符

	1，可以修饰类，方法，变量
	2，final修饰的类不能被继承
	3, final修饰的方法不能被覆盖
	4,内部类只能访问被final修饰的局部变量
	5，final修饰的变量是一个常量，只能被赋值一次
		--对固定不变的值进行名称的定义，提高其阅读性
		final修饰的变量的命名规则：所有字母都大写，若有多个单词，单词间_连接
*/

/*final*/ class Animal{
	String name;

	/*final*/ void show(){
		System.out.println("Animal");
	}
}

class Cat extends Animal{
	void show(){
		System.out.println("Animal");
	}
}

class FinalDemo{
	public static void main(String[] args){
		//Cat c = new Cat();

		final double PI = 3.14;
		final int MAX_VALUE = 100;

		//PI = 5;
	}
}