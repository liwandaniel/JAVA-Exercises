//多态，用接口规定固定的规则，让类根据这个规则来实现接口，最终方便功能的拓展，降低程序的耦合度
interface userFunc
{
	public void add(User User);

	public void delete(User User);

	public void select(User User);

	public void update(User User);
}


class UserInfoByJDBC implements userFunc
{
	public void add(User User)
	{
		System.out.println("add:" + User);
	}

	public void delete(User User)
	{
		System.out.println("delete:" + User);
	}

	public void select(User User)
	{
		System.out.println("select:" + User);
	}

	public void update(User User)
	{
		System.out.println("update:" + User);
	}
}

class User
{
	String name = "liwan";
}

class PolymorphismDemo4
{
	public static void main(String[] args) {
		userFunc user = new UserInfoByJDBC();
		user.add(new User());
		user.delete(new User());
	}
}
