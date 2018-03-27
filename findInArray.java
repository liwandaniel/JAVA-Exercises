// 查找数组元素index
class findInArray
{
	public static void main(String[] args) {
		int [] arr = {2, 4, 3, 5, 7, 1};
		int index = getIndex(arr, 20);
		System.out.println("index:"+ index);
	}

	public static int getIndex(int [] arr, int key)
	{
		for (int x = 0; x<arr.length; x++) {
			if (arr[x]==key) {
				return x;		
			}		
		}
		return -1;	
	}
}