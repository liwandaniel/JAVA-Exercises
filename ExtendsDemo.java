/*
类的继承
*/
class extendsDemo{
	public static void main(String[] args) {
		
	}
}

class Person{
	String name;
	int age;
}

class Student extends Person{
	void study()
	{
		System.out.println("study");
	}
}

class Worker extends Person{
	void work()
	{
		System.out.println("work");
	}
}