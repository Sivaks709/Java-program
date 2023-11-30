class Engine
{
    String Type,cc,power;
    int storage;
    Engine(String t,String cc,String p)
    {
        this.Type=t;
        this.cc=cc;
        this.power=p;
    }
    public void Enginedetails()
    {
        System.out.println("the type is : "+Type);
        System.out.println("the cc is : "+cc);
        System.out.println("the power is : "+power);
        System.out.println("the storage is : "+storage);
    }
}