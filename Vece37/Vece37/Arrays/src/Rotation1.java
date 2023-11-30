import java.util.*;
public class Rotation1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        System.out.print("Enter Number : ");
        int input=s.nextInt();
        for (int index = 1; index <= input; index++) {
            int first=number[0];
            for (int i = 0; i < number.length-1; i++) {
                number[i]=number[i+1];
                System.out.print(number[i]+" ");
            }
            number[number.length-1]=first;
            System.out.println(number[number.length-1]+" ");
        }
    }
}
