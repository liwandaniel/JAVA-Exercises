// 十进制-->十六进制
class decimalismtohexadecimal
{
	public static void main(String[] args) {
		toHex(-60);
	}

	public static void toHex(int num)
	{	
		//查表转换 
		char[] chs = {'0','1','2','3',
						'4','5','6','7',
						'8','9','A','B',
						'C','D','E','F'};
		//自定义一个容器
		char[] arr = new char[8];
		int pos = arr.length-1;
		while(num!=0)
		{
			int temp = num & 15;
			arr[pos] = chs[temp];
			pos--;
			num = num >>>4;
		}
		//遍历打印
		for (int x=0; x<arr.length; x++) {
			System.out.print(arr[x]);
		}
		// StringBuffer StringBufferObject = new StringBuffer();    //字符串容器，存在内存中
		// for (int x=0;x<8;x++) {
		// 	int temp = num & 15;
		// 	if(temp>9)
		// 		StringBufferObject.append((char)(temp-10+'A'));
		// 	else
		// 		StringBufferObject.append(temp);
		// 	num = num >>> 4;
		// }
		// System.out.println(StringBufferObject.reverse());
	} 
}