class Railway
{
	static String TrainName="mathsyagandha";
	static String TrainStation="udupi";
	static float time=4.08f;
	static int TrainID=4850;

	static
	{
	System.out.println("welcome to Indian Railway");
	}

	public static void TrainDetails()
	{
	System.out.println("The name of the Train is" +TrainName);
	System.out.println("The name of the Train Station is" +TrainStation);
	System.out.println("The arrivaltime of the Train is" +time);
	System.out.println("The id of the Train is" +TrainID);
	}

	public static void main(String[] args)
	{
	TrainDetails();
	}
}
	