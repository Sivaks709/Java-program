import java.util.*;
public class Pyramid {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Row : ");
        int n=s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



// Enter Row : 5


//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * * 
//   * * *
//    * *
//     *