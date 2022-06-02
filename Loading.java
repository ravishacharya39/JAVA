class Loading
{
	public static void m1()
	{
	System.out.println("its time to give break");
	}

	public static void m2()
	{
	System.out.println("its time to drink coffee");
	m1();
	}


	public static void main(String[] args)
	{
	System.out.println("starts here");
  
	m2();
	System.out.println("ends here");
}
}