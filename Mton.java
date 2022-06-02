import java.util.Scanner;

class Mton
{

	public static void Mton(int m,int n)
{
	for(int i=m;i<n;i++)
	{
	System.out.println(i);
	}
}
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the m value");
	int m=s.nextInt();
	
	System.out.println("enter the n value");
	int n=s.nextInt();
	
	Mton(m,n);
	}
}