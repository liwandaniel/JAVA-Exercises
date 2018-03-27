class decimalismtobinary
{
	public static void main(String[] args) {
		toBinary(20);
	}

	public static void toBinary(int num)
	{
		StringBuffer StringBufferObject = new StringBuffer();    //字符串容器，存在内存中
		while(num>0)
		{
			StringBufferObject.append(num%2);
			num = num / 2;
		}
		System.out.println(StringBufferObject.reverse());
	} 
}