class ForTest
{
	public static void main(String[] args)
	{
		/*int sum = 0;
		int x = 1;
		while(x<=10)
		{
			sum = sum + x;
			x++;
		}
		System.out.println("sum=" + sum);*/
		
		int sum = 0;
		for(int x = 0; x<=10; x++)
		{
			sum += x;
		}
		System.out.println("for sum=" + sum);
	}
}
