import java.util.Scanner;
public class peng1{
	public static void main(String[] srgs){
		System.out.print("����������Ԫ�صĸ�����");
		Scanner scanner1=new Scanner(System.in);
		int i=scanner1.nextInt();
		int[] sortNum1 = new int[i];
		System.out.print("����������Ԫ��(��������������Ϊ׼)��");
		Scanner scanner2=new Scanner(System.in);
		for (int j=0;j<i;j++){
			sortNum1[j]=scanner2.nextInt();
		}
		maopaoSort(sortNum1);
		System.out.print("����Ԫ�������(��С����)��");
		for(int num:sortNum1)
		System.out.print(num+"\t");
	}
	public static void maopaoSort(int[] sortNum){
		int temp = 0;
		for (int i = 0; i < sortNum.length-1; i++) {
			for (int j = 0; j < sortNum.length-1-i; j++) {
				if(sortNum[j+1]<sortNum[j]){
					temp = sortNum[j];
					sortNum[j] = sortNum[j+1];
					sortNum[j+1] = temp;
				}
			}
		}
	}
}