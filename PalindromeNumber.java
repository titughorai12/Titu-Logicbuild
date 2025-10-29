class PalindromeNumber
{
	public static void main(String ags[])
	{
		int n=78;
		int rev=0;
		int temp=n;
		while(n>0)
		{
			rev = rev * 10 + (n % 10);
			n=n/10;
		}
		if(rev==temp)
			System.out.println(temp+"is a palindrome");
		else
			System.out.println(temp+"is a not palindrome");
	}
}
		