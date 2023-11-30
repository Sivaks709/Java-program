package JustIntergate;

import java.util.Scanner;

public class partten {
    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        int n=new Scanner(System.in).nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
