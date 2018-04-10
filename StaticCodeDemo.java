class StaticCodeDemo
{
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args) {
		System.out.println("d");
		new StaticCode();
		new StaticCode();
		System.out.println("e");
	}

		static
	{
		System.out.println("c");
	}
}

class StaticCode
{
	static
	{
		System.out.println("a");
	}
} 