class Disarium
{
	public static void main(String args[])
	{
		int n=153;
		int digit=0;
		int temp=n;
		int sum=0;
		while(temp!=0)
		{
			temp=temp/10;
			digit++;
		}
		int temp1=n;
		while(temp1>0)
		{
			int rem=temp1%10;
			sum+=(int)Math.pow(rem,digit);
			digit--;
			temp1/=10;
		}
		if(sum==n)
		{
			System.out.println("Disarium number is:"+n);
		}
		else
		{
			System.out.println("Disarium number is not:"+n);
		}
		
	}
}