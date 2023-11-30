class $1A3B
{
    public static void main(String[] args)
    {
        char ch='A';
        for(int i=1;i<10;i++)  
        {
            if(i%2==1)
            {
                System.out.println("1"+"*"+i+"="+i);
            }
            else
            {
                System.out.println(ch);
                ch++;
            }
        }
    }
}