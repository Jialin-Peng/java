package �����ض��ַ����ֵĴ���;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		//�����ַ����ַ����г��ֵĴ���
		System.out.print("������һ���ַ�����");
		String s1=sc.next();
		System.out.print("��������Ҫ���ҵ��ַ���");
		char c1=sc.next().charAt(0);
		char[] c2=s1.toCharArray();
		int i=0;
		for(char c3:c2) {
			if(c1==c3)
				i++;
			}
		System.out.print("����ҵ��ַ����ַ����г��֣�"+i+"��");		
	}

}
