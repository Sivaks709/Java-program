import java.util.*;
public class testpress_Q2 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        int num = s.nextInt();
        if (num == 0 || num == 1){
            System.out.println("Please Enter igger Than 0 And 1");
        }
        else{
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
