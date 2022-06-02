class Fruit
{
	
}

class Apple extends Fruit
{
	
}

class Mango extends Fruit
{
	
}

class GreenApple extends Apple
{
	
}


public class FruitDriver {

	public static void main(String[] args) {
		Apple a = new Apple();
		GreenApple g = new GreenApple();
		Mango m = new Mango();
		Fruit f = new Fruit();
		System.out.println("----Apple----");
		System.out.println("a instanceof Apple      -> "+ (a instanceof Apple));
		System.out.println("a instanceof Fruit      -> "+ (a instanceof Fruit));
		//System.out.println(a instanceof Mango);   -> CTE
		System.out.println("a instanceof GreenApple -> "+ (a instanceof GreenApple));
		System.out.println();
		System.out.println("--GreenApple--");
		System.out.println("g instanceof GreenApple -> " + (g instanceof GreenApple));
		System.out.println("g instanceof Apple      -> "+(g instanceof Apple));
		System.out.println("g instanceof Fruit      -> "+(g instanceof Fruit));
		//System.out.println(g instanceof Mango);   -> CTE
		System.out.println();
		System.out.println("----Mango----");
		System.out.println("m instanceof Mango      -> "+(m instanceof Mango));
		System.out.println("m instanceof Fruit      -> "+(m instanceof Fruit));
		//System.out.println(m instanceof Apple);   -> CTE
		//System.out.println(m instanceof GreenApple); -> CTE
		System.out.println();
		System.out.println("----Fruit----");
		System.out.println("f instanceof Fruit      -> "+(f instanceof Fruit));
		System.out.println("f instanceof Apple      -> "+(f instanceof Apple));
		System.out.println("f instanceof Mango      -> "+(f instanceof Mango));
		System.out.println("f instanceof GreenApple -> "+(f instanceof GreenApple));
		
		

	}

}
