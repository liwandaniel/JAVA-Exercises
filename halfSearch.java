//折半查找
class halfSearch
{
	public static void main(String[] args) {
		int [] arr = {4, 8, 3, 1, 9, 5, 7, 6, 2};
		int index = halfSearch(arr, 20);
		System.out.println("index=" + index);
	}

	public static int halfSearch(int [] arr, int key)
	{
		int min, mid, max;
		min = 0;
		max = arr.length - 1;
		mid = (min+max)/2;

		while (arr[mid]!=key) {
			if (key>arr[mid]) {
				min = mid + 1;
			}
			else if (key<arr[mid]) {
				max = mid - 1;
			}
			if (min>max) {
				return -1;
			}
			mid = (min+max)/2;
		}
		return mid;

	}
}