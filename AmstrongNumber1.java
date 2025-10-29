class ArmstrongNumber1 {
    public static void main(String args[])
	{
        int range = 1000;

        for (int i = 1; i <= range; i++) 
		{
            int digit = 0;
            int sum = 0;
            int m = i;
            while (m != 0) 
			{
                digit++;
                m = m / 10;
            }

            // Calculate Armstrong sum
            m = i;
            while (m != 0)
				{
                int r = m % 10;
                sum =sum+(int)Math.pow(r, digit);
                m = m / 10;
            }

            if (sum == i)
                System.out.println(i);
        }
    }
}