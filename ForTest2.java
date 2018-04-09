/*
1~100之间7的倍数的个数，并打印
*/
class ForTest2
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int x = 1; x<=101; x++)
		{
			if(x % 7 ==0)
			{
				sum ++;
			}
		}
		System.out.println("sum=" + sum);
	}
}
