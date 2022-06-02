import java.util.Scanner;

public class Google {
	Shopping s;

	Scanner s1= new Scanner(System.in);

	public void addorders()
	{
		if(this.s==null)
		{
	System.out.println("1.Flipkart\n2.Amazon\n3.Myntra");
	int ch=s.nextInt();
	if(ch==1)
	{
		System.out.println("enter the belts");
		int belt=s1.nextInt();

		System.out.println("enter the shoes");
		int shoe=s1.nextInt();
		

		System.out.println("enter the dress");
		int dress=s1.nextInt();
		
		this.s=new Flipkart(belt,shoe,dress);
		
	}
	else if(ch==2)
	{
		System.out.println("enter the belts");
		int belt=s1.nextInt();

		System.out.println("enter the shoes");
		int shoe=s1.nextInt();
		
		System.out.println("enter the dress");
		int dress=s1.nextInt();
		
		this.s=new Amazon(belt,shoe,dress);
	}
	else if(ch==3)
	{
		System.out.println("enter the belts");
		int belt=s1.nextInt();

		System.out.println("enter the shoes");
		int shoe=s1.nextInt();
		

		System.out.println("enter the dress");
		int dress=s1.nextInt();
		
		this.s=new Myntra(belt,shoe,dress);
	}
	else
	{
		System.out.println("order already placed");
	}
		}

	public void showshoppingdetails()
		{
			if(this.s!=null)
			{
				if(s instanceof Flipkart)
				{
					Flipkart f=(Flipkart)s;
					f.getShoppingdetails();
				}
				else if(s instanceof Amazon)
				{
					Amazon a=(Amazon)s;
					a.getShoppingdetails();
				}
				else if(s instanceof Myntra)
				{
					Myntra m=(Myntra)s;
					m.getShoppingdetails();
				}
			}
				else
				{
					System.out.println("no orders");
				}
			
			}

	public void cancelorders()
			{
				if(this.s!=null)
				{
					if(s instanceof Flipkart)
					{
					this.s=null;
					System.out.println("Flipkart order is canceled");
				
					}
					
					else if(s instanceof Amazon)
							{
								this.s=null;
								System.out.println("Amazon order is canceled");
								
							}
							else if(s instanceof Myntra)
							{
								this.s=null;
								System.out.println("Myntra order is canceled");
								
							}
					
						}
					
			}
}
