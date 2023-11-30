class mobile
{
    String name;
    String ram;
    int storage;
    sim slot;
    mobile()
    {

    }
    mobile(String name,String ram,int storage)
    {
        this.name=name;
        this.ram=ram;
        this.storage=storage;
    }
    public void insertsim(sim s)
    {
        if (this.slot==null)
        {
            this.slot=s;
            System.out.println("sim inserted succesfully");
        }
        else
        {
            System.out.println("sim is already present");
        }
    }
    public void removesim()
    {
        if (this.slot!=null)
        {
            this.slot=null;
            System.out.println("sim is removed succesfully");
        }
        else
        {
            System.out.println("already sim is removed");
        }
    }
    public boolean simslotEmpty()
    {
        if (this.slot!=null)
        {
             return true;
        }
        else
        {
             return false;
        }
    }
    public void detailsofmobile()
    {
        System.out.println("mobile name : "+this.name);
        System.out.println("mobile ram : "+this.ram);
        System.out.println("mobile storage : "+this.storage);
        System.out.println((char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2);
    }
}