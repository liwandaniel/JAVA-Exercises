abstract class Student{
	public abstract void study();
	public void sleep()
	{
		System.out.println("sleep");
	}
}

class BaseStudent extends Student{
	public void study()
	{
		System.out.println("base study");
	}

	public void sleep()
	{
		System.out.println("base sleep");
	}
}

class SeniorStudent extends Student{
	public void study()
	{
		System.out.println("senior study");
	}

	public void sleep()
	{
		System.out.println("senior sleep");
	}
}

class doSomething{
	public void doSome(Student x)
	{
		x.study();
		x.sleep();
	}
}

class PolymorphismDemo2
{
	public static void main(String[] args) {
		doSomething studentDo = new doSomething();
		studentDo.doSome(new BaseStudent());
		studentDo.doSome(new SeniorStudent());
	}
}


