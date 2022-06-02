import java.util.Scanner;
class Calculator
{

	public static void add()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enterthe first value");
	int n1=s.nextInt();

	System.out.println("enterthe second value");
	int n2=s.nextInt();

	int c=n1+n2;
	System.out.println(c);
	}

	public static void sub()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first value");
 	int n1=s.nextInt();

	System.out.println("enter the second value");
 	int n2=s.nextInt();

	int c=n1-n2;
	System.out.println(c);
	}

	public static void multi()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first value");
 	int n1=s.nextInt();

	System.out.println("enter the second value");
 	int n2=s.nextInt();

	int c=n1*n2;
	System.out.println(c);
}

	public static void div()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first value");
 	int n1=s.nextInt();

	System.out.println("enter the second value");
 	int n2=s.nextInt();

	int c=n1/n2;
	System.out.println(c);
	}

	public static void main(String[] args)
	{
	
	add();
	sub();
	multi();
	div();
	}
}