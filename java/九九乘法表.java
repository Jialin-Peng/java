public class 九九乘法表{
	public static void main(String[] args) {
		int i,j;
		System.out.print("\n");
		System.out.println("\t\t\t\t九九乘法表");
		System.out.print("\n");
		for(i=1;i<10;i++){
			System.out.print(i +"\t");
		}
		System.out.print("\n");
		for(i=1;i<71;i++){
			System.out.print("-");
		}
		System.out.print("\n");
		for(i=1;i<10;i++)
			for(j=1;j<10;j++){
				System.out.print(i +"*"+ j +"="+ i*j +"\t");
				if(j%9==0)
				System.out.print("\n");
		}
	}
}