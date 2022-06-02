
public class Mobile {

	
	String brand;
	String color;
	double price;
	int ram;
	Sim s;
	
	Mobile(String brand,String color,double price,int ram,Sim s)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.ram=ram;
		this.s=s;
	}
		
		
		public void print()
		{
			System.out.println("mobile brand "+brand);
			System.out.println("mobile color "+color);
			System.out.println("mobile price "+price);
			System.out.println("Mobile Ram "+ram);
			
		}
		public void simdetails()
		{
			System.out.println("sim talktime "+s.talktime);
			System.out.println("sim serviceprovider "+s.serviceprovider);
			System.out.println("sim number "+s.simnumber);
			
		}
	
}
