

	
	import java.util.Scanner;
	public class GoogleDriver {

		public static void main(String[] args) {
			Scanner var = new Scanner(System.in);
			Google g = new Google();
			boolean exit = true;
			while(exit)
			{
				System.out.println("1. Add Orders\n2. Show Shopping Details\n3. Cancel Orders\n4. Exit");
				System.out.println("Enter your choice");
				int ch = var.nextInt();
				switch(ch)
				{
				case 1: g.addorders();
				break;
				
				case 2: g.showshoppingdetails();
				break;
				
				case 3: g.cancelorders();
				break;
							
				case 4: exit = false;
				System.out.println("Thank You");
				break;
				
				default : System.out.println("Invalid Choice");
				break;
				}
			}
		}

	}


