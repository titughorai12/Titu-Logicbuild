class SumofOddDigits
{
	public static void main(String args[])
	{
		int n=299;
		int i;
		int sum =0;
		while(n>0)
		{
			i=n%10;
			if(n%2!=0)
			{
			 sum=sum+i;
			}
			n=n/10;
		}
		System.out.println(sum);
	}
}
