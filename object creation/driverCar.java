import java.util.*;
class driverCar
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter Car Name");
        String n=s.next();
        System.out.println("Enter Car Color");
        String c=s.next();
        System.out.println("Enter Car Price");
        double p=s.nextDouble();
        car cars=new car(n,c,p);
        cars.details();
    }    
}
