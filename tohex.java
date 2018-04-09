class demo
{
	public static void main(String[] args){
		String data = "Hello I'm a OkSocket demo";
		System.out.println(toHexString(data));
    }
    public static String toHexString(String s) 
	{ 
	String str=""; 
	for (int i=0;i<s.length();i++) 
	{ 
	int ch = (int)s.charAt(i); 
	String s4 = Integer.toHexString(ch & 0xff); 
	str = str + s4 + " "; 
	} 
	return str; 
	} 	
}

