/*
继承函数的重写（覆盖）
*/
class Father{
	Father()
	{
		System.out.println("run father");
	}
	// int num = 4;
	void show()
	{
		System.out.println("father");
	}
}


class Son extends Father{
	Son()
	{
		System.out.println("run Son");
	}

	Son(int x)
	{
		System.out.println("run Son..." + x);
	}
	// int num = 5;
	void show()
	{
		System.out.println("son");
	}
}

class extendsDemo2{
	public static void main(String[] args) {
		Son son1 = new Son();
		Son son2 = new Son(20);
		// son1.show();
		// System.out.println(son1.num + "......" + son1.num);
	}
}