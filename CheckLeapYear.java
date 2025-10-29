class CheckLeapYear
{
	public static void main(String args[])
	{
		int year=2024;
		if(((year%400==0)||(year%4==0))&&(year!=0))
			System.out.println("Year is leap");
		else
			System.out.println("Year is not leap");
		
	}
}