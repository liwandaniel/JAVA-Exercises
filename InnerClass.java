// 内部类
// 内部类可以直接访问外部的类的成员，包括私有的
// 内部类可以作为静态被static关键字修饰，但是想要访问外部类的静态成员
class Outer
{
	private static int x = 3;

	static class Inner
	{
		void func()
		{
			System.out.println("inner:" + x);
		}
	}

	void method()
	{
		Inner inner1 = new Inner();
		inner1.func();
	}
}

class InnerClass
{
	public static void main(String[] args) {
		// Outer.Inner instance = new Outer().new Inner();
		// instance.method();
		new Outer.Inner().func();
	}
}