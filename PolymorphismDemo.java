abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{
	void eat()
	{
		System.out.println("cat eat fish");
	}

	void sleep()
	{
		System.out.println("cat sleep");
	}
}

class Dog extends Animal{
	void eat()
	{
		System.out.println("dog eat meat");
	}

	void run()
	{
		System.out.println("dog run");
	}
}

class PolymorphismDemo{
	public static void main(String[] args) {
		// Animal Tom = new Cat();  // 类型提升
		// Tom.eat();
		// Cat Tom2 = (Cat)Tom;	//强制将父类的引用，转成子类类型，向下转型，向下转型可以重新获取被类型提升丢失的子类的方法
		// Tom2.sleep();
		// func(Tom);
		// func(new Cat());
		// func(new Dog());
		func(new Dog());
	}

	public static void func(Animal x)
	{
		x.eat();
		if (x instanceof Cat) {
			Cat c = (Cat)x;
			c.sleep();
		}
		else if (x instanceof Dog) {
			Dog d = (Dog)x;
			d.run();
		}
	}
}







