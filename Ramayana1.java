class Ramayana1
{

	
	public static void lakshman()
	{
	System.out.println("program started");
	System.out.println("pgm ended");
	}

	public static void ram()
	{
	System.out.println("program started");
	System.out.println("ram is executing");
	sita();
	}

	public static void sita()
	{
	System.out.println("program started");
	System.out.println("sita is executing");
	lakshman();
	}

	public static void main(String[] args)
	{
	System.out.println("main  started");
	sita();
	System.out.println("main ended");
	}

	

	

}