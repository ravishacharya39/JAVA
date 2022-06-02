
public class Driver {

	public static void main(String[] args)
	{
		Car c=new Car("red",100000,"Lamborghini",new Engine(3000,8888));
		System.out.println(" cc  " +c.e.cc);
		System.out.println(" eng no  " +c.e.engno);
		System.out.println(" color  " +c.color);
		System.out.println(" price  " +c.price);
		System.out.println(" brand " +c.brand);
	}
}
