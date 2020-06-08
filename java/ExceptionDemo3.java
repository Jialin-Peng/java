/*
	异常类：java程序在运行时期发生的一些不正常情况

	throws:用来声明问题,用在方法上，声明异常类，声明的异常类可以有多个，throws A,B,C
	throw:用来抛出问题，用在方法内，用来抛出异常对象，一次只能抛出一个异常对象


*/

class Demo{
	int div(int a, int b) throws ArithmeticException{
		if (b==0){
			throw new ArithmeticException();//创建一个异常对象，并将其用throw抛出
		}
		return a/b;
	}
	//在方法内部，如果有异常抛出的话，方法上一定要声明问题，方便调用者处理
	
}

class ExceptionDemo3{
	public static void main(String[] args){//使用try catch捕获异常
		Demo d = new Demo();
		
		try{
			System.out.println(d.div(4,0));
			System.out.println("除法运算已完成。。。");
		}catch(ArithmeticException e){//调用的工作抛出的是什么异常，就catch什么异常
			System.out.println("Message="+e.getMessage());
			System.out.println("toString()="+e.toString());
			e.printStackTrace();
			System.out.println("出错啦！！！！");
		}
		System.out.println("Over!!!");
		
	}
}