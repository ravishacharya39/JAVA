class Ramayana3
{

	
	public static void lakshman()
	{
	System.out.println("program started");
	sita();
	System.out.println("pgm ended");
	
	}

	public static void ram()
	{
	System.out.println("program started");
	System.out.println("m1() is executing");
	lakshman();
	System.out.println("program ended");
	
	}

	public static void sita()
	{
	System.out.println("program started");
	System.out.println("sita is executing");
	System.out.println("program ended");
	
	}

	public static void main(String[] args)
	{
	System.out.println("pgm  started");
	ram();
	System.out.println("pgm ended");
	}

	

	

}