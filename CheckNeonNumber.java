class CheckNeonNumber
{
	public static void main(String args[])
	{
		int n=9;
		int squre =n*n;
		int sum =0;
		while(squre>0)
		{
			sum = sum+(squre%10);
		    squre =squre/10;
		}
		if(sum==n)
			System.out.println("number is neon");
		else
			System.out.println("number is not neon");
	}
}