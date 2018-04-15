class Fu
{
	int num = 5;
	void method1()
	{
		System.out.println("fu method1");
	}

	void method2()
	{
		System.out.println("fu method2");
	}

	static void method4()
	{
		System.out.println("fu method4");
	}
}

class Zi extends Fu
{
	int num = 8;
	void method1()
	{
		System.out.println("zi method1");
	}

	void method3()
	{
		System.out.println("zi method3");
	}

	static void method4()
	{
		System.out.println("zi method4");
	}
}


class PolymorphismDemo3
{
	public static void main(String[] args) {
		Fu f = new Zi();	
		// f.method1(); //非静态的方法，这里经过重写，调用的是子类的
		// f.method2();	//调用的是父类的method，因为是从父类继承过来的
		// f.method3();  //方法找不到，因为父类中没有这个方法，编译失败
		System.out.println(f.num);		//这里获取的num是父类的num，多态情况下，重名的成员变量看的是左边的引用，也就是父类的变量
		f.method4();	//静态方法，多态情况下，也是看左边的引用，正常开发情况下，不会有覆盖静态方法的情况
	}
}
