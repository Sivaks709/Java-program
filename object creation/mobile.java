class mobile 
{
    String name;
    String model;
    String ram;
    int price;

    mobile(String n,String m,String r,int p)
    {
        name=n;
        model=m;
        ram=r;
        price=p;
    }
    public void details() 
    {
        System.out.println("This Is Mobile Name : "+name);
        System.out.println("This Is Mobile Name : "+model);
        System.out.println("This Is Mobile Name : "+ram);
        System.out.println("This Is Mobile Name : "+price);
    }
}
