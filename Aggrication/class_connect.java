import java.util.*;
class class_connect
{
    static Scanner s=new Scanner(System.in);
    static boolean b=true;
    static mobile m=new mobile("mi", "8gb", 128);
    public static void main(String[] args)
    {
        do{
            System.out.println("* * *  welcome to poorvika  * * *");
            System.out.println("1. Display Mobile Details\n2. Display Sim Details\n3. is sim slot empty\n4. insert sim\n5. remove sim\n6. EXIT");
            System.out.println("Select Your Option");
            int n=s.nextInt();
            sim s=new sim("jio", "4g",8778828680l,4.5);
            switch(n)
            {
                case 1:
                {
                
                    m.detailsofmobile();
                    break;
                }
                case 2:
                {
                    if (m.simslotEmpty())
                    {
                        m.slot.detailsOfSIM();
                    }
                    else
                    {
                        System.out.println("Insert sim can't display the details");
                    }
                    break;
                }
                case 3:
                {
                    if(m.simslotEmpty())
                    {
                        System.out.println("sim is present");
                    }
                    else
                    {
                        System.out.println("sim is not present");
                    }
                    break;
                }
                case 4:
                {
                    m.insertsim(new sim("jio","5g",555,4.5));
                    break;
                }
                case 5:
                {
                    m.removesim();
                    break;
                }
                case 6:
                {
                    b=false;
                    System.out.println((char)3+" "+(char)5+" "+(char)5+"Tata Bye Bye See You"+(char)5+" "+(char)5+" "+(char)5);
                    break;
                }
                default:
                {
                    System.out.println("Pls Enter the correct Number");
                } 
            }
        
        }while(b);
    }

}