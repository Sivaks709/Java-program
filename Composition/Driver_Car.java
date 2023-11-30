import javax.xml.catalog.Catalog;

public class Driver_Car
{
    public static void main(String[] args) {
        Car car1=new Car("rolls royce", "black", 5000000d);
        car1.detailesofcar();
        car1.connectTOengine();
    }
}
