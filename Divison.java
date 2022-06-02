import java.util.Scanner;
public class Divison {
	
	
	public static void test()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first value");
		int v1=s.nextInt();
		
		System.out.println("Enter the second value");
		int v2=s.nextInt();
		
		int v3=v1/v2;
		System.out.println("the value of v3 is :" +v3);
		
		
	}
	public static void main(String[] args) {
		test();
		
	}
	

}
