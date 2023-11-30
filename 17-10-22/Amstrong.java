import java.util.*;
class Amstrong
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter Number");
        int n=s.nextInt();
        int temp=n,last=0,product=1,count=0,res=0;
        while (n>0) // 153, 15, 1, 0; 
        {
            n/=10; //  15, 1;
            count++;// 1, 2, 3;
        }
        n=temp;  //153
        while (n>0) // 153, 15, 1, 0;
        {
            last=n%10; // 3, 5, 1;
            product=1;
            for (int i = 1; i <= count; i++)// 1<=3, 2<=3, 3<=3 ## | 4<=4 Con Fal |
            {
                product*=last; // 27, 125, 
            }
            res+=product; // 27, 152, 
            n/=10; // 15, 1;
        }
        if (temp==res)
        {
            System.out.println(res+" Armstrong");
        }
        else
        {
            System.out.println(res+" Not a Armstrong");
        }

    }
    
}
