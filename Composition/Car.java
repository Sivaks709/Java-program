class Car
{
    String name,color;
    double price;
    Engine e=new Engine("desul","1500","400");
    Car(String n,String c,Double p)
    {
        this.name=n;
        this.color=c;
        this.price=p;
    }
    public void detailesofcar()
    {
        System.out.println("the car name : "+name);
        System.out.println("the car color : "+color);
        System.out.println("the car price : "+price);
        System.out.println("******************************");
    }
    public void connectTOengine()
    {
        e.Enginedetails();
    }
}
