import java.util.Scanner;
public class dowhile {
	public static void main(String[] args) {
		int i=0,he=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������������-1��������");
		do{
			i=scanner.nextInt();
			he=he+i;
		}
		while(i != -1);
		he=he+1;
		System.out.println("������������(����-1)�ĺ�Ϊ��"+ he);
	}
}

