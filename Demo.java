class Demo
{
	public static void main(String[] args)
	{
	System.out.println("main  started");
	m1();
	m2();
	System.out.println("main ended");
	}

	public static void m1()
	{
	System.out.println("M1()is executing");
	m2();
	}

	public static void m2()
	{
	System.out.println("m2()is executing");
	}
}
