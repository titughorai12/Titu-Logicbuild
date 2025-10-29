class program1
{
	int a=12;
	int b=34;
	void display()
	//program1(int a,int b)
	{
		System.out.println("Floating Point Numbers is:"+a * b);
	}
}
class FloatingPointNumbers
{
	public static void main(String args[])
	{
		program1 ob1=new program1();
		//program1 ob1=new program1(12,8);
		ob1.display();
	}
}