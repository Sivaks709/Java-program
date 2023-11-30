class car
{
    String name;
    double price;
    String color;
    car(String n,String co,double p)
    {
        price=p;
        color=co;
        name=n;
    }
     public void details()
     {
        System.out.println("This Is Car Name : "+name);
        System.out.println("This Is Car color : "+color);
        System.out.println("This Is Car price : "+price);
     }
}