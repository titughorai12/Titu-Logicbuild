class Automorphic
{
	public static void main(String args[])
	{
		int n=10;
		int digit=0;
		int t=n;
		while(t!=0)
		{
			t=t/10;
			digit++;
		}
		int square=(int)Math.pow(n,n);
		int result=square%10;
		if(n==result)
		{
			System.out.println("Number is Automorphic"+result);
		}
	}
}