import java.util.Scanner;
class E
{
	public static void main(String[] args)
	{
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value for a");
	int a=s.nextInt();
	
	System.out.println("enter the value for b");
	int b=s.nextInt();
	
	System.out.println("1.add\n,2.sub\n,3.multi\n,4.div\n");
	System.out.println("enter the choice");
	int ch=s.nextInt();
	switch(ch)
	{
	case 1:System.out.println("addition of 2 number is"+(a+b));
							break;
	case 2:System.out.println("subtraction of 2 number is"+(a-b));
							break;
	case 3:System.out.println("multiplication of 2 number is"+(a*b));
							break;
	case 4:System.out.println("division of 2 number is"+(a/b));
							break;
	default:System.out.println("your choice is invalid");
	}
}
}
							
	
	
	
	
	