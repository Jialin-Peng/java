import java.util.Scanner;
public class peng2{
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
		System.out.println();
		System.out.print("������Ҫ���ҵ�Ԫ�أ�");
		Scanner scanner3=new Scanner(System.in);
		int num=scanner1.nextInt();
		int no=zheBan(sortNum1,num);
		System.out.println("��Ԫ����������������е��±�Ϊ(-1Ϊδ�ҵ���Ԫ��)��"+no);
	}
	public static void maopaoSort(int[] sortNum){//ð������
		int temp = 0;
		for (int i = 0; i < sortNum.length-1; i++){
			for (int j = 0; j < sortNum.length-1-i; j++){
				if(sortNum[j+1]<sortNum[j]){
					temp = sortNum[j];
					sortNum[j] = sortNum[j+1];
					sortNum[j+1] = temp;
				}
			}
		}
	}
	public static int zheBan(int[] arr,int findElem){//�۰����
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (findElem < arr[mid]){
                high = mid - 1;
            }
            if (findElem > arr[mid]){
                low = mid + 1;
            }
            if (arr[mid] == findElem){
                return mid;
            }
        }
        return -1;
    }
}