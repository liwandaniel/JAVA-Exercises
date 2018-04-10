/*
对象是方法被调用时才初始化，也叫做对象的延时加载，称为懒汉式
Singleton类进内存，对象还没有存在，只有调用了getInstance方法时才建立对象
*/
class Singleton2
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
    private static Singleton2 instance=null;
    private Singleton2(){
    	
    }

    public static Singleton2 getInstance() // 此处可以加同步锁，防止多线程情况下多个对象同时存在，但是会影响效率
    //public static Singleton getInstance(){
    {
        if(instance==null)
        {
            instance=new Singleton2();
        }
        return instance;
    }
    /*
    加同步锁时，前后两次判断实例是否存在, 当有实例存在的时候，不读取锁也不创建实例，就可以提高效率，但是代码量变多了
    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
    */
}

class SingletonDemo2{
	public static void main(String[] args) 
	{
		Singleton2 s1 = Singleton2.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
		s1.setNum(30);
		System.out.println(s2.getNum());
	}
}