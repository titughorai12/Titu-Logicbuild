class FactorialofaNumber
{
	public static void main(String args[])
	{
		int num =30;
		long factorial=1;
		int i;
		for(i=1;i<= num ;i++)
		{
			factorial=factorial*i;
	   }
	   System.out.println("Factorial of " + num + " is " +factorial);
	}
}