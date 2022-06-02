
public class Student {
	static String name;
	static int a;
	Student(String name,int a)
	{
		this.name=name;
		this.a=a;
		
	}
	public String toString()
	{
		return name +"\t" + a;
	}
	public static void main(String[] args) {
		Student s=new Student("Ravish",18);
		System.out.println(s);
	}

}
