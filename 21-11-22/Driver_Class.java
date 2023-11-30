import java.util.*;
class Driver_Class
{
    static Scanner s=new Scanner(System.in);
    
    public static void main(String[] args)
    {
        boolean b=true;
        Bag m=new Bag();
        do
        {
           
            System.out.println((char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" Welcome To PlayGround  "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2+" "+(char)2);
            System.out.println("1. Ball Add\n2. Remove Ball\n3. Check Bag Empty Or Not\n4. Show Game That Can Be Played\n5. Exit.");
            System.out.print("Select You Wish : ");
            int n=s.nextInt();
            switch(n)
            {
                case 1:
                {
                    
                    m.addball();
                    break;
                }
            }
            
        }while(b);
    }
}
