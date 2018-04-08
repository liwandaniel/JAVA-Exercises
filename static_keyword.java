class Person
{
	private String name;
	private static String country = "cn";
	public void show()
	{
		System.out.println(name+"::"+country);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getCountry()
	{
		return this.country;
	}
}


class staticDemo
{
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("zhangsan");
		System.out.println("result: " + p.getName());

	}
}