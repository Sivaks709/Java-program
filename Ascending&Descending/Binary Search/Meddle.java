import java.util.*;
public class Meddle {

    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Key Element : ");
        int key=s.nextInt();
        System.out.println(binarySearch(key));
    }
    public static int binarySearch(int key) {
        int b[]={1,2,3,4,5};
        int lower=b[0];
        int higher=b.length-1;
        int mid=(lower+higher)/2;
        while (higher<=lower)
        {
            
            if (key==b[mid])
            {
                System.out.println("Present");
                return mid;
            }
            if (key>b[mid])
            {
                lower=mid+1;
            } 
            else
            {
                higher=mid-1;
            }
            // return mid;

        }
        return mid;
        
    }
}
