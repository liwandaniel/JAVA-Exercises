class ArrayToolDemo
{
	public static void main(String[] args) {
		int[] arr = {3, 5, 89, 45, 20, 10};
		ArrayTools tool = new ArrayTools();
		int max = ArrayTools.getMax(arr);
		System.out.println("max=" + max);

		int min = ArrayTools.getMin(arr);
		System.out.println("min=" + min);

		// tool.selectSort(arr);
		ArrayTools.bubbleSort(arr);
		ArrayTools.printArr(arr);
	}
}