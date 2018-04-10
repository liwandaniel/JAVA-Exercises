/*
先初始化对象，称为饿汉式
Singleton类一进内存，就直接已经创建好了对象
定义单例模式的时候，建议使用饿汉式
*/
class Singleton
{	
	private int num;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
    private Singleton(){}

    private static Singleton instance = new Singleton();

    public static Singleton getInstance()
    {
        return instance;
    }
}

class SingletonDemo1{
	public static void main(String[] args) 
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		s1.setNum(20);
		System.out.println(s2.getNum());
	}
}