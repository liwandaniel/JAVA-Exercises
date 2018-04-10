/*
用类封装实现工具
讲类中的函数都变成静态方法，直接通过类名调用，不需要存在类中的成员变量
私有化一些不需要外露的方法，同时私有化构造函数，防止不必要的创建对象占用内存
*/

/**
* 这是一个可以对数组进行操作的工具类
* 比如：获取最值，排序。
* @author liwan
* @version V1.0
*/

public class ArrayTools
{	
	private ArrayTools(){}

	/**
	* 获取一个整形数组的最大值
	* @param arr 接收一个int类型的数组
	* @return 会返回一个该数组的最大值
	*/
	public static int getMax(int[] arr)
	{
		int max = 0;
		for (int x = 1; x < arr.length; x++) {
			if (arr[x]>arr[max])
				max = x;
		}
	return arr[max];
	}

	/**
	* 获取一个整形数组的最小值
	* @param arr 接收一个int类型的数组
	* @return 会返回一个该数组的最小值
	*/
	public static int getMin(int[] arr)
	{
		int min = 0;
		for (int y = 1; y < arr.length; y++) {
			if(arr[y]<arr[min])
				min = y;
		}
	return arr[min];
	}

	/**
	* 给int数组进行选择排序
	* @param arr 接收一个int类型的数组
	*/
	public static void selectSort(int[] arr)
	{
		for (int x = 0; x<arr.length-1; x++) {
			for (int y=x+1; y<arr.length; y++) {
				if (arr[x]>arr[y]) {
					swap(arr, x, y);
				}
			}
		}
	}

	/**
	* 给int数组进行冒泡排序
	* @param arr 接收一个int类型的数组
	*/
	public static void bubbleSort(int[] arr)
	{
		for (int x = 0; x<arr.length-1; x++) {
			for (int y=0; y<arr.length-x-1; y++) {
				if (arr[y]>arr[y+1]) {
					swap(arr, y, y+1);
				}
			}
		}
	}

	/**
	* 私有方法，给int数组的元素进行位置置换
	* @param arr 接收一个int类型的数组
	* @param a 需要置换的第一个元素位置
	* @param b 需要置换的第二个元素位置
	*/
	private static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	/**
	* 打印数组中的元素， 打印形式是：[element1, element2, ...]
	* @param arr 接收一个int类型的数组
	*/
	public static void printArr(int[] arr)
	{	
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x != arr.length - 1)
				System.out.print(arr[x] + ", ");
			else
				System.out.print(arr[x] + "]");
		}
	}
}











