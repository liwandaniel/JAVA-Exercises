// 十进制-->二进制
class decimalismtobinary
{
	public static void main(String[] args) {
		toBinary(-8);
	}

	public static void toBinary(int num)
	{
		//二进制表
		char[] chs = {'0', '1'}; 

		// 定义一个容器
		char[] arr = new char[32];

		//定义一个操作数组的指针
		int pos = arr.length;

		while (num!=0) {
			int temp = num & 1;
			arr[--pos] = chs[temp];
			num = num >>>1;
		}
		//遍历打印
		for (int x=pos; x<arr.length; x++) {
			System.out.print(arr[x]);
		}

		// StringBuffer StringBufferObject = new StringBuffer();    //字符串容器，存在内存中
		// while(num>0)
		// {
		// 	StringBufferObject.append(num%2);
		// 	num = num / 2;
		// }
		// System.out.println(StringBufferObject.reverse());
	} 
}