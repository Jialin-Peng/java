package 查找特定字符出现的次数;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		//查找字符在字符串中出现的次数
		System.out.print("请输入一个字符串：");
		String s1=sc.next();
		System.out.print("请输入你要查找的字符：");
		char c1=sc.next().charAt(0);
		char[] c2=s1.toCharArray();
		int i=0;
		for(char c3:c2) {
			if(c1==c3)
				i++;
			}
		System.out.print("你查找的字符在字符串中出现："+i+"次");		
	}

}
