class A
 {
    int n = 34;
    int a = 0;
    int b = 1;
    int temp;
    int sum = 0;

    void B()
	{
        
        while (a <= n) 
		{
            System.out.println(a);
            //sum =sum+a;
            temp = a + b;
            a = b;
            b = temp;
        }
        //System.out.println("Sum of series: " + sum);
    }
}
class FibonacciSeries
{
	public static void main(String args[])
	{
		A s1=new A();
		s1.B();
		//s1.displayInfo();
	}
}
