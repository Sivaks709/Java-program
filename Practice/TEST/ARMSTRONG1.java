package TEST;

import java.util.Scanner;

public class ARMSTRONG1 {

    static Scanner s= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Value : ");
        int Num=s.nextInt();
        int Count=0,Temp=Num,Fact=1,Last=0,Sum=0;
        while (Num>0) {
            Num/=10;
            Count++;
        }
        Num=Temp;
        while (Num>0) {
            Fact=1;
            Last=Num%10;
            for (int i = 1; i <= Count; i++) {
                Fact*=Last;
            }
            Sum+=Fact;
            Num/=10;
        }
        if (Sum==Temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not A Armstrong");
        }
    }
}