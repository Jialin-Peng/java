import java.util.Scanner;
public class peng2{
	public static void main(String[] srgs){
		System.out.print("请输入数组元素的个数：");
		Scanner scanner1=new Scanner(System.in);
		int i=scanner1.nextInt();
		int[] sortNum1 = new int[i];
		System.out.print("请输入数组元素(个数由上面输入为准)：");
		Scanner scanner2=new Scanner(System.in);
		for (int j=0;j<i;j++){
			sortNum1[j]=scanner2.nextInt();
		}
		maopaoSort(sortNum1);
		System.out.print("数组元素排序后(由小至大)：");
		for(int num:sortNum1)
		System.out.print(num+"\t");
		System.out.println();
		System.out.print("请输入要查找的元素：");
		Scanner scanner3=new Scanner(System.in);
		int num=scanner1.nextInt();
		int no=zheBan(sortNum1,num);
		System.out.println("该元素在已排序的数组中的下标为(-1为未找到该元素)："+no);
	}
	public static void maopaoSort(int[] sortNum){//冒泡排序
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
	public static int zheBan(int[] arr,int findElem){//折半查找
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