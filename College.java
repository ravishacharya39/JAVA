import java.util.Scanner;

public class College {
	String clgname;
	String location;
	int capacity;
	String principalname;
	Student2 s;
	
	College(String clgname,String location,int capacity,String principalname)
	{
		this.clgname=clgname;
		this.location=location;
		this.capacity=capacity;
		this.principalname=principalname;
	}
	
	public void Addstudent()
	{
		if(this.s==null)
		{
		this.s=new Student2("ravish",20,"male");
				System.out.println("student added");
				System.out.println();
		}
		else
		{
			System.out.println("already student exist");
		}
	}
//	public void Studentdetails()
//	{
//		if(this.s!=null)
//		{
//		System.out.println("Student name "+s.name);
//		System.out.println("Student age "+s.age);
//		System.out.println("Student gender "+s.gender);
//		}
//		else
//		{
//			System.out.println("no students");
//		}
//	}
	
	public void studentdetails()
	{
		if(this.s!=null)
		{
		System.out.println(s);
		}
		else
		{
			System.out.println("no students");	
		}
	}
	public void clgdetails()
	{
		System.out.println("clg name "+clgname);
		System.out.println("clg location "+location);
		System.out.println("clg capacity "+capacity);
		System.out.println("clg principalname "+principalname);
	}
	public void removestudent()
	{   if(this.s==null)
		{
		System.out.println("there is no student");
		}
	   else
	   {
		this.s=null;
		System.out.println("student removed");
		
	    }
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		College c=new College("AIET","Mijar",1000,"Peterfernandes");
		boolean exit=true;
		while(exit)
		{
		System.out.println("1.addstudent\n2.showstudentdetails\n3.showclgdetails\n4.removestudent\n5.exit");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:c.Addstudent();
				break;
				
		case 2:c.studentdetails();
				break;
				
		case 3:c.clgdetails();
				break;
		case 4:c.removestudent();
				break;
		case 5:exit=false;
				break;
		}
		
		}
		
		
		
	}
}
