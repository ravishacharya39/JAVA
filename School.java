
import java.util.Scanner;
class School
{

		static
		{
		System.out.println("Welcome to Aiet");
		}
	
	
	
		static String studentName="Ravish";
		static int studID=44;
	   static String BloodGroup="B+ve";
	

	public static void Principal()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the principal name");
		String PrincipalName=s.nextLine();
		
		System.out.println("enter the principal email");
		String pmail=s.nextLine();
		
		System.out.println("name of the principal is "+PrincipalName);
		System.out.println("mail of the principal is "+pmail);
		}


	public static void student()
	{
	System.out.println("The name of the student is " +studentName);
	System.out.println("The student blood group is " +BloodGroup);
	System.out.println("id of the student "+studID);
	
	}

	public static void main(String[] args)
	{
	student();
	Principal();
	}
}
	