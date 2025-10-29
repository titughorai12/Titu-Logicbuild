class program1
{
	int a=10;
	int b=20;
	void swap()
	//program1(int a,int b)
	{
		System.out.println("Affter swap a is:"+a+"  b is:"+b);
	    a=a+b;
	    b=a-b;
	    a=a-b;
		 System.out.println("Before swap a is:"+ a +"  b is:"+b);
	}
}
class SwapTwoNumbers
{
	public static void main(String args[])
	{
		//program1 ob1=new program1(23,10);
		program1 ob1=new program1();
		ob1.swap();
	}
}