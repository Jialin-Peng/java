public class 输出100{
	public static void main(String[] args) {
		int i=1;
		System.out.println("1-100之间的所有整数：");
		for(;i<=100;i++){
			System.out.print(i +"\t");
			if(i%5==0){
				System.out.println();
			}
		}
	}
}