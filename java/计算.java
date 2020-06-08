public class 计算 {
	public static void main(String[] args) {
		int i=1,he=0;
		while(i<=100){
			he=i+he;
			i++;
		}
		System.out.println("1-100的和为："+ he +"。");
	}
}
