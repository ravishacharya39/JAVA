class Student1
{
	String name;
	String id;
	int sem;
	String branch;

	Student1()
	{
	

	}

	
	Student1(String name)
	{
	this.name=name;

	}

	
	Student1(String name,String id)
	{
	this.name=name;
	this.id=id;

	}

	Student1(String name,String id,int sem)
	{
	this.name=name;
	this.id=id;
	this.sem=sem;
	}

	Student1(String name,String id,int sem,String branch)
	{
	this.name=name;
	this.id=id;
	this.sem=sem;
	this.branch=branch;

	}

	public void print()
	{
	System.out.println("---------------------------------------");
	System.out.println(name);
	System.out.println(id);
	System.out.println(sem+" "+branch);
	System.out.println("---------------------------------------");
	}
	
	

	public static void main(String[] args)
	{
	Student1 s=new Student1();
	Student1 s1=new Student1("ravish");
	Student1 s2=new Student1("adarsh","is0003");
	Student1 s3=new Student1("abhi dodda","is0002",6);
	Student1 s4=new Student1("Sudeep","is0001",6,"ise");
	
	s.print();
	s1.print();
	s2.print();
	s3.print();
	s4.print();
	
	}
}
	
	
	



	
