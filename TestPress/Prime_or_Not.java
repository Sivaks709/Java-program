import java.util.Scanner;

public class Prime_or_Not {
    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        int num=new Scanner(System.in).nextInt(),count=1;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.print(count==2?"Prime":"Not Prime");
    }
}
