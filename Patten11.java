import java.util.*;
class Patten11
{
	public static void main(String arg[])
	{
		System.out.print("Enter a range:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i+=2)
		{
			for(int j=n;j>=i;j-=2)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//System.out.println();
	}
}