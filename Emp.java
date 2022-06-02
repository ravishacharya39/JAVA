class Emp
{
	static String Name="ravish";
	static int usn=44;

	String name="Ravish Acharya";
	String rollno="4al19is044";


public  void m1()
{
	System.out.println("This is not static method");
}

public static void m2()
{
	System.out.println("this is static method");
}

public static void main(String[] args)
{
	Emp e=new Emp();
	e.m1();
	m2();

	System.out.println(Name);
	System.out.println(usn);

	System.out.println(e.name);
	System.out.println(e.rollno);
}
}