/* 一个有序的数组，插入一个元素，并保证数组依然是有序的
*/
class ArrayTest
{
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 7, 9, 10, 13, 20, 22};
		int index = getIndex(arr, 8);
		System.out.println(index);
	}

	public static int getIndex(int[] arr, int key)
	{
		int min=0,max=arr.length-1,mid;
		while (min<=max) {
			mid = (min+max)>>1;
			if (key>arr[mid]) {
				min = mid + 1;
			}
			else if (key<arr[mid]) {
				max = mid - 1; 
			}
			else
				return mid;
		}
		return min;
	}
}