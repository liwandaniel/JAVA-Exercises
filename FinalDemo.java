/*
1. final 可以修饰类，函数，变量
2. 被final修饰的类不能被继承
3. 被final修饰的方法不可以被复写
4. 被final修饰的变量是一个常量，只能被赋值一次
*/

// final class finalclass{
class  finalclass{
	final int x = 3;

	final void test1(){}

	void test2(){
		x = 4;
	}
}

class subClass extends finalclass  //此处继承会提示不能从最终类进行继承
{
	void test1(){}

	void test2(){}
}

class FinalDemo
{
	public static void main(String[] args) {
		
	}
}