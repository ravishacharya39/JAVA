import java.util.Scanner;

public class Hotel {
	int capacity;
	String name;
	String owner_name;
	Swiggy s;

	Hotel(int capacity, String name, String owner_name) {
		this.capacity = capacity;
		this.name = name;
		this.owner_name = owner_name;
	}

	public void Bookorder() {
		if(this.s==null)
		{
			this.s = new Swiggy(125, 500, "udupi");
			System.out.println("order booked");
		}
		else
		{
			System.out.println("order is aleardy placed");
		}
	}

	public void Cancelorder() {
		if(this.s == null)
		{
		System.out.println("u have no orders");
		}
		else
		{
			this.s=null;
		
		System.out.println("order is cancelled");
		}
	}

	public void showswiggydetails() {
		if(this.s!=null)
		{
		System.out.println(s.order_no + " " + s.price + " " + s.location);
		}
		else
		{
			System.out.println("you dont have any orders");
		}

	}

	public void Hoteldetails() {
		System.out.println("capacity of the hotels " + capacity);
		System.out.println("name of the hotels " + name);
		System.out.println("owner of the hotel" + owner_name);
		System.out.println("capacity of the hotels " + capacity);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Hotel h = new Hotel(120, "Pearl", "ravish");

		boolean exit = true;
		while (exit) {

			System.out.println("1.Book order\n2.show swiggy details\n3.show hotel details\n4.cancel the order");
			int ch = s.nextInt();

			switch (ch) {
			case 1:
				h.Bookorder();
				break;

			case 2:
				h.showswiggydetails();
				break;

			case 3:
				h.Hoteldetails();
				break;

			case 4:
				h.Cancelorder();
				break;
			case 5:
				exit = false;
				break;
			}
		}

	}
}
