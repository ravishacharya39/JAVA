
public class Flipkart extends Shopping {
	

	
	Flipkart(int belt,int shoe,int dress)
	{
		super(belt,shoe,dress);
	}
	
	public void getShoppingdetails()
	{
		System.out.println("belt available "+belt);
		System.out.println("shoes available "+shoe);
		System.out.println("dress available "+dress);
	}

}
