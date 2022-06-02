
public class Driver2 {
	
	public static void main(String[] args) {
		
	
	
	Parent a=new Child();
	Child b=(Child)a;
	b.m2();
	System.out.println(b.a);
	b.m1();
	}
	
	

}
