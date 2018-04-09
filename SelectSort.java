// 选择排序
class SelectSort
{
	public static void main(String[] args) {
		int[] arr = {8, 5, 1, 9, 6, 4, 2};
		printArray(arr);
		selectSort(arr);
	}

	public static void selectSort(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    printArray(arr);
                }
            }
        }
	}

	public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }
}