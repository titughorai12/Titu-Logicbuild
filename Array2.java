class Array2
{
	public static void main(String args[])
	{
		int arr[]={5,6,7,5,10,11,5,5,9,6,2,};
		int key=5;
		int f=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				f++;
			}
			
		}
		System.out.println("My key value "+f+" time appears");
	}
}