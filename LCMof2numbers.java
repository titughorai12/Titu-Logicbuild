class LCMof2numbers
{
	public static void main(String args[])
	{
		int a=12;
		int b=20;
		int lcm;
		int max ;
		
		if (a>b)
			//System.out.println(a);
		   max=a;
		
		else
			//System.out.println(b);
		   max=b;
		while(true)
		{
			if((max %a==0)&&(max %b==0))
			{
				lcm=max;
				break;
			}
			 
			max++;
		}
		System.out.println("lcm is:"+lcm);
	}
}