abstract class Person{
	abstract void study();
	void sleep()
	{
		System.out.println("sleep");
	}
}

interface Smoking{
	void smoke();
}

interface Drinking{
	void drink();
}

class Student extends Person implements Smoking, Drinking{
	void study(){};
	public void smoke(){};
	public void drink(){};
}

class Teacher extends Person implements Drinking{
	void study(){};
	public void drink(){};
}

class InterFaceTest{
	public static void main(String[] args) {
		Student zhangsan = new Student();
		zhangsan.sleep();
	}
}

