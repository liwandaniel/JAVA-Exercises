/*
计算程序运行时间
模板方法模式
*/
abstract class getRunTime{
	public final void getTime()
	{
		long startTime = System.currentTimeMillis(); //获取开始时间
		doSomething(); //测试的代码段
		long endTime = System.currentTimeMillis(); //获取结束时间
		System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间
	}

	public abstract void doSomething()
	{
		for (int x = 0; x< 100000; x++) {
			System.out.println(x);
		}
	}
}

class subRunTime extends getRunTime{
	public void doSomething()
	{
		for (int x = 0; x< 200000; x++) {
			System.out.println(x);
		}
	}
}

class getRunTimeDemo{
	public static void main(String[] args) {
		subRunTime getTime = new subRunTime();
		getTime.getTime();
	}
}