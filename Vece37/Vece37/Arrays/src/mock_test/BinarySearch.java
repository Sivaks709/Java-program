package mock_test;

import java.util.Scanner;

public class BinarySearch {

    static Scanner s = new Scanner(System.in);
    static String res = "NOT PRESENT...";

    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int key = s.nextInt();
        int Num[] = { 2, 66, 5, 54, 10, 3, 56, 23, 98 };
        System.out.println(binary(Num, key));
    }

    public static String binary(int Num[], int Key) {
        int low = 0, hi = Num.length - 1, mid;

        while (hi >= low) {

            mid = (hi + low) / 2;
            if (Key == Num[mid]) {

                res = "Present";
                break;
            } else if (Key > Num[mid]) {
                low = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return res;
    }
}