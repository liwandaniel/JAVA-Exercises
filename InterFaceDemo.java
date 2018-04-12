// 接口不可以创建对象，因为有抽象方法
// 接口可以被类多实现
// 类继承父类的同时也可以实现接口
// 接口可以继承接口
// 接口之间存在多继承
interface InterFaceTest{
	public static final int NUM = 3;
	public abstract void show();
}

interface InterFaceTest2{
	public abstract void show2();
}

class Demo{
	public void function(){};
}

class Test extends Demo implements InterFaceTest, InterFaceTest2{
	public void show(){};
	public void show2(){};
}


interface A{
	void methodA();
}
interface B{
	void methodB();
}
interface C extends B, A{
	void methodC();
}
class D implements C{
	public void methodA(){};
	public void methodB(){};
	public void methodC(){};
}

class InterFaceDemo
{
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(InterFaceTest.NUM);
	}
}