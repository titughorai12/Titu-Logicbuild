class Array1
{
	public static void main(String []args)
	{
		int arr[]={10,20,30,40,50};
		int key=4;
		int n=arr.length;
		int f=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				f=1;
				break;
			}
			
		}
		if(f==1)
		{
            System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}