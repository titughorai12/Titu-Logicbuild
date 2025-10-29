class NeonNumber
{
	public static void main(String args[])
	{
		int num=1000;
		for(int i=1;i<=num;i++)
		{
			int sum=0;
			int squar=num*num;
			int temp=squar;
			while(temp!=0)
			{
				int r=temp%10;
				sum=sum+r;
				temp=temp/10;
			}
			if(sum==i)
				System.out.println("Neon number is:"+i);
			
		}
	}
}