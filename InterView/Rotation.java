import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        int Num[]={1,2,3};
        System.out.print("Enter The Number : ");
        int Num1=new Scanner(System.in).nextInt();
        for (int i = 0; i < Num1; i++) {

            int First=Num[0];

            for (int j = 0; j < Num.length-1; j++) {

                Num[j]=Num[j+1];
                System.out.print(Num[j]+"  ");

            }
            Num[Num.length-1]=First;

            System.out.println(Num[Num.length-1]);
        }
    }
}
