/*
抽象类
*/
abstract class Student{
	abstract void study();
}

class BaseStudent extends Student{
	void study()
	{
		System.out.println("base study");
	}
}

class AdvStudent extends Student{
	void study()
	{
		System.out.println("adv study");
	}
}

class AbstractDemo{
	public static void main(String[] args) {
		new Student();
	}
}