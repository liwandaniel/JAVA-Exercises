class ArrayDemo3
{
	public static void main(String[] args) {
		// 数组的操作：
		// 获取数组中的元素
		int arr [] = {0,1,2,3,4,5,6,7,8,9};
		printArray(arr);
	}

	public static void printArray(int [] arr)
	{
		for(int x = 0; x<arr.length; x++)
		{
			if (x!=arr.length-1) {
				System.out.print(arr[x] + ",");

			}
			else
				System.out.println(x);
		}
	}
}