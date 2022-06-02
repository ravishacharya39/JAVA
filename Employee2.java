
public class Employee2 {
	String name;
	Employee2(String name)
	{
		this.name=name;
		
	}
	public boolean equals(Object o)
	{
		Employee2 e5=(Employee2)o;
		if(this.name==e5.name);
		return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		
		Employee2 e=new Employee2("Ravish");
		Employee2 e1=new Employee2("Ravish");
		Employee2 e2=new Employee2("Ravish");
		Employee2 e3=new Employee2("Ravish");
		Employee2 e4=new Employee2("Ravish");
		System.out.println(e==e1);
		System.out.println(e1==e2);
		System.out.println(e2==e3);
		System.out.println(e3==e4);
		
		
		System.out.println(e.equals(e1));
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(e4.equals(e5));
		
	}

}
