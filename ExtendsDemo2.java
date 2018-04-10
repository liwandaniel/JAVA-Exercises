/*
继承函数的重写（覆盖）
*/
class Father{
	int num;
	Father(int x)
	{
		num = 60;
		System.out.println("run father" + x);
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
		super(4);
		System.out.println("run Son");
	}

	Son(int x)
	{
		super(2);
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
		System.out.println(son1.num);
		// son1.show();
		// System.out.println(son1.num + "......" + son1.num);
	}
}