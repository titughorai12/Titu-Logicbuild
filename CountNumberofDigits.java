class CountNumberofDigits
{
	public static void main(String args[])
	{
		int i=12;
		int count =0;
		while(i!=0)
		{
			count++;
		    i=i/10;
		}
		
		System.out.println("Count of number is"+count);
	}
}