import java.util.*;
class primerange
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=2;i<num;i++)
		{
			int f=0;
			
			for(int j=2;j<i;j++)
			{
			   if(i%j==0)
			  {
				  f=1;
				  break;
			  }
			}
			if(f==0)
			{
			   System.out.println(i);
		       sum=sum+i;
			}
		
		}
		System.out.println(sum);
		
	}	
	
}