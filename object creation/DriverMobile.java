import java.util.*;
class DriverMobile
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Mobile Name");
        String n=s.next();
        System.out.println("Enter Model Name");
        String m=s.next();
        System.out.println("Enter Ram Size");
        String r=s.next();
        System.out.println("Enter Mobile Price");
        int p=s.nextInt();
        mobile mob_del=new mobile(n, m, r, p);
    }
}
