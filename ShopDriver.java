public class ShopDriver {
    public static void main(String[] args) {
        Shop s=new Shop("Dmart");
        Shop s1=new Shop("Ravish");
        Shop s2=new Shop("udupi");
        Shop s3=new Shop(7);
        Shop s4=new Shop(973117586);

        System.out.println("---------------------Befor using setter method-----------------------");
        System.out.println(s.getshopname());
        System.out.println(s1.getshopownername());
        System.out.println(s2.getshopplace());
        System.out.println(s3.getshopid());
        System.out.println(s4.getownerno());
        System.out.println(s.getshopname("----------------------------------------------------------"));

        s.setshopname("canara");
        s1.setshopownername("")






    }
