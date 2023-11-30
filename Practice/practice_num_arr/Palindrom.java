package practice_num_arr;

import java.util.Scanner;

public class Palindrom {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        int num=s.nextInt();
        int res=0,temp=num;
        while (num>0) {
            res=res*10+(num%10);
            num/=10;
        }
        System.out.println(temp==res?res+" Given Number Is Plindrom...":res+" Given Number Is Not Plindrom...");
    }
}
