/*
包：(package)
1，对类文件进行分类管理
2，给类提供多层命名（名称）空间
3，写在程序的第一行
4，类名的全称：包名.类名
5，包也是封装的一种形式
*/

/*

		public	   protected	   default	 private
同一个类中       √          √               √           √
同一包中         √          √               √           ×
子类             √          √               ×           ×
不同包中         √          ×               ×           ×
*/  

package mypack;

class PackageDemo{
	public static void main(String[] args){
		System.out.println("Package run.");
	}
}

