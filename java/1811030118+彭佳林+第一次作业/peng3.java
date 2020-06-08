import java.util.Scanner;
public class peng  
{
	public static void main(String[] args) 
	{
		int i,j,k;
		System.out.print("ÇëÊäÈëĞĞÊı£º");
		Scanner scanner = new Scanner(System.in);
		k = scanner.nextInt(); 
		for(i=1; i<=k;i++)
		{
            for(j=1;j<=k-i;j++)
			{
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
			{
                System.out.print('*');
            }
                System.out.println();
        }
        for(i=1;i<=k-1;i++)
		{
            for(j=1;j<=i;j++)
			{
                System.out.print(" ");
            }
            for(j=1;j<=2*(k-i)-1;j++)
			{
                System.out.print('*');
            }
                System.out.println();
        }
	}
}
