class Employee1
	{
	String name;
	String ssn;
	int salary;
	String place;

	Employee1(String name)
	{
	this.name=name;
	}

	Employee1(String name,String ssn)
	{
	this(name);
	this.ssn=ssn;
	}

	Employee1(String name,String ssn,int salary)
	{
	this(name,ssn);
	this.salary=salary;
	}

	Employee1(String name,String ssn,int salary,String place)
	{
	this(name,ssn,salary);
	this.place=place;
	}

	public void print()
	{
	System.out.println("------------------------");
	System.out.println("name "+name);
	System.out.println("ssn "+ssn);
	System.out.println("salary "+salary);
	System.out.println("place "+place);
	System.out.println("------------------------");
	}


	public static void main(String[] args)
	{
	Employee1 e=new Employee1("sudeep");
	Employee1 e1=new Employee1("adarsh","i9is003");
	Employee1 e2=new Employee1("lathesh","i9is020",20000);
	Employee1 e3=new Employee1("Ravish","i9is044",100000,"udupi");

	e.print();
	e1.print();
	e2.print();
	e3.print();
	}
  }


	
	