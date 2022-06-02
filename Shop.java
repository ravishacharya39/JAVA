public class Shop {
    private String shopname;
    private String shopownername;
    private String shopplace;
    private int shopid;
    private long  ownerno;

    Shop(String shopname)
    {
        this.shopname=shopname;

    }

    Shop(String shopownername)
    {
        this.shopownername=shopownername;

    }

    Shop(String shopplace)
    {
        this.shopplace=shopplace;

    }

    Shop(int shopid)
    {
        this.shopid=shopid;

    }

    Shop(long ownerno)
    {
        this.ownerno=ownerno;

    }

    public String getshopname()
    {
        return shopname;
    }

    public String getshopownername()
    {
        return shopownername;
    }


    public String getshopplace()
    {
        return shopplace;
    }

    public int getshopid()
    {
        return shopid;
    }

    public long getownerno()
    {
        return ownerno;
    }

    public void setshopname(String shopname)
    {
        this.shopname=shopname;
    }
    public void setShopownername(String Shopownername)
    {
        this.shopownername=shopownername;
    }

    public void setShopplace(String shopplace) {
        this.shopplace = shopplace;
    }
    public void setShopid(int shopid)
    {
        this.shopid=shopid;
    }
    public void ownerno(long ownerno)
    {
        this.ownerno=ownerno;
    }


}
