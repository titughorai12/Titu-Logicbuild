 class EvenSumofFibonacciSeries
 {
	 public static void main(String args[])
	 {
		 int n=360;
		 int a=0;
		 int b=1;
		 int sum=0;
		while(a<=n)
		{
			if(a%2==0)
			{
				sum=sum+a;
			}
			int temp=a+b;
			a=b;
			b=temp;
		}
		System.out.println(sum);
	 }	 
 }