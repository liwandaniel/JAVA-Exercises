// 十进制-->十六进制
class decimalismtohexadecimal
{
	public static void main(String[] args) {
		toHex(60);
	}

	public static void toHex(int num)
	{
		StringBuffer StringBufferObject = new StringBuffer();    //字符串容器，存在内存中
		for (int x=0;x<8;x++) {
			int temp = num & 15;
			if(temp>9)
				StringBufferObject.append((char)(temp-10+'A'));
			else
				StringBufferObject.append(temp);
			num = num >>> 4;
		}
		System.out.println(StringBufferObject.reverse());
	} 
}