/*
	异常类：java程序在运行时期发生的一些不正常情况

	throws:用来声明问题
	throw:用来抛出问题
*/

class Demo{
	int div(int a, int b) throws Exception{//在方法行上声明问题
		return a/b;
	}
	
}

class ExceptionDemo1{
	public static void main(String[] args) throws Exception{//主方法没有进行捕获处理，直接继续抛出
		Demo d = new Demo();

		int dd = d.div(4,0);
	}
}