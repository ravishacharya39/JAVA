
public class Ticket1 {

		 private String moviename;
		 private int ticketid;
		 private  double price;
		
		Ticket1(String moviename,int ticketid, double price)
		{
			this.moviename=moviename;
			this.ticketid=ticketid;
			this.price=price;
			
		}
		
		public String getmoviename()
		{
			
		return moviename;
		
		}
		
		public int getticketid()
		{
			
		return ticketid;
		
		}

		public double getprice()
		{
			
		return price;
		
		}
		
		public void setmoviename(String moviename) 
		{
			this.moviename=moviename;
		}
		
		public void setticketid(int ticketid) 
		{
			this.ticketid=ticketid;
		}
		
		public void setprice( double price) 
		{
			this.price=price;
		}
		public String toString()
		{
			return moviename+"\n"+ticketid+"\n"+price);
		}




}
