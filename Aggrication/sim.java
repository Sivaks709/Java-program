class sim
{
    String operater_name;
    double price;
    String band_width;
    private long contact=8778828680l;
    double call_rate;
    sim()
    {
        
    }
    sim(String operater_name,String band_width,double price,double call_rate)
    {
        this.operater_name=operater_name;
        this.band_width=band_width;
        this.price=price;
        this.call_rate=call_rate;
    }
    public void detailsOfSIM()
    {
        System.out.println("operater name : "+this.operater_name);
        System.out.println("price : "+price);
        System.out.println("band width : "+this.band_width);
        System.out.println("contact : "+this.contact);
        System.out.println("call rate : "+this.call_rate);
        System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
    }
    private long getContact() 
    {
        return contact;
    }
}
