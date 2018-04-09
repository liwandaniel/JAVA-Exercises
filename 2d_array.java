// 二维数组的操作
class Array2d
{
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12, 13}};
		int count = 0;
		for (int x=0; x<arr.length; x++) {
			for (int y=0; y<arr[x].length; y++) {
				count = count + arr[x][y];
			}
		}
		System.out.println(count);
	}
}