/*
	异常类：java程序在运行时期发生的一些不正常情况

	throws:用来声明问题
	throw:用来抛出问题

	异常捕获的专用语句
	try{
		需要检测的代码（有可能会发生异常的代码）
	}
	catch(异常类 变量){
		异常的处理代码
	}
	finally{
		一定会执行的代码//关闭资源
	}

	try catch finally的组合方式
	1，try catch:只处理异常，没有资源需要关闭
	2，try finally:不处理异常，但需要关闭资源
	3，try catch finally
*/

class Demo{
	int div(int a, int b) throws Exception{//在方法行上声明问题
		return a/b;
	}
	
}

class ExceptionDemo2{
	public static void main(String[] args){//使用try catch捕获异常
		Demo d = new Demo();
		try{
			int dd = d.div(4,0);
			System.out.println("dd="+dd);
		}
		catch(Exception e){
			System.out.println("message="+e.getMessage());//打印异常信息
			System.out.println("toString="+e.toString());//打印出异常名称和异常信息
			e.printStackTrace();			//打印异常名称信息，位置到控制台上，就是默认的处理方式
			System.out.println("出错啦！！！！！！");
		}
		
		System.out.println("over!!!!");
		
	}
}