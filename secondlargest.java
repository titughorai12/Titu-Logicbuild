class secondlargest
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50,60,80,70,80};
		int n=arr.length;
		int largest=0;
		int slargest=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>largest)
			{
				slargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>slargest&&arr[i]!=largest)
			{
				slargest=arr[i];
				
			}
			
		}
		System.out.println(slargest);
	}
}