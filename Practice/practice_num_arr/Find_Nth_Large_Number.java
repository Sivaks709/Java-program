package practice_num_arr;

import java.util.Scanner;

public class Find_Nth_Large_Number {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        int num = scanner.nextInt(), arr[] = { 1, 2, 3, 4, 5, 12, 42, 5, 6 }, large = arr[0];
        for (int i = 0; i < num; i++) {
            large = arr[0];

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > large) {
                    large = arr[j];
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (large == arr[j]) {
                    arr[j] = -38;
                }
            }
        }
        System.out.println(large);
    }
}
