
public class Driver3 {
	public static void main(String[] args) {
		A2 a=new B2();
		System.out.println("-------------variable shadowing------------");
		System.out.println(a.b);
		System.out.println(a.a);
		System.out.println();
		
		B2 b=(B2)a;
		System.out.println(b.a);
		System.out.println(b.b);
		
	}
	
	

}
