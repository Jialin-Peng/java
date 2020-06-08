import java.util.Scanner;
public class dowhile {
	public static void main(String[] args) {
		int i=0,he=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入整数（以-1结束）：");
		do{
			i=scanner.nextInt();
			he=he+i;
		}
		while(i != -1);
		he=he+1;
		System.out.println("输入所有整数(不算-1)的和为："+ he);
	}
}

