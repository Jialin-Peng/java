import java.util.Scanner;
public class 数组{
	public static void main(String[] srgs){
		Scanner scanner=new Scanner(System.in);
		int[] scores=new int [10];
		double max;
		int a;
		System.out.println("请输入10个学生成绩：");
		for(int i=0;i<10;i++){
			scores[i]=scanner.nextInt();	
		}
		max=scores[0];a=1;
		for(int i=1;i<scores.length;i++){
			if(max<scores[i]){
				max=scores[i];
				a=1;
			}else if(max==scores[i]){
				a++;
			}
		}
		System.out.println("最大值为："+max+"\n出现次数为："+a);
	}
}