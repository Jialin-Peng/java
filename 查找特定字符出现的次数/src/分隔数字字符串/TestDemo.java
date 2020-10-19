package ·Ö¸ôÊý×Ö×Ö·û´®;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TestDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		//·Ö¸ôÊý×Ö×Ö·û´®
		//Collections list=new Collections();
		System.out.print("ÇëÊäÈëÒ»´®Êý×Ö£º");
		String s1=sc.next();
		char[] c1=s1.toCharArray();
		ArrayList<Character> list=new ArrayList<Character>();
		for(char c2:c1) {
			(list).add(c2);
		}
		Collections.reverse(list);
		for(int i=0;i<=list.size();i++) {
			int i2=3*i;
			list.add(i2,',');
		}
			
		
		Iterator<Character> it=list.iterator();
		for(;it.hasNext();) {
			
			System.out.print(it.next());
		}
		
		
				
	}

}
