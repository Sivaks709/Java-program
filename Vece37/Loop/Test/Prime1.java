package Test;
import java.util.*;
public class Prime1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Value : ");
		int num=s.nextInt(),count=0;
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				count++;
			}
    	}
		if (count==2) {
			System.out.println(num+" IS PRIME NUMBER...");
		} else {
			System.out.println(num+" NOT IS PRIME NUMBER...");
		}
	}
}
