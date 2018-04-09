class ArrayDemo4
{
	public static void main(String[] args) {
		// 数组的操作：
		// 获取数组中的元素
		int arr [] = {1, 2, 34, 445, 543, 534};
		System.out.println(getMax(arr));
	}

	public static int getMax(int [] arr)
	{
		int max = arr[0];
		for(int x = 0; x < arr.length; x++)
		{
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		return max;
	}
}