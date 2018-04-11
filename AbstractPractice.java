class Employee{
	private String name;
	private String id;
	private double salary;

	Employee(String name, String id, double salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public abstract void work()   //因为不能确认继承的类是否是用同样的功能，所以选择抽象方法
	{
		System.out.println("Employee work");
	}
}


class Staff extends Employee{
	Staff(String name, String id, double salary)
	{
		super(name, id, salary);
	}

		public void work()
	{
		System.out.println("Staff work");
	}
}

class Manager extends Employee{
	private int bonus;

	Manager(String name, String id, double salary, int bonus)
	{
		super(name, id, salary);
		this.bonus = bonus;
	}

	public void work()
	{
		System.out.println("Manager work");
	}
}


class AbstractPractice
{
	public static void main(String[] args) {
		
	}
}