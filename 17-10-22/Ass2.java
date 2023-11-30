class Abcd
{
    public static void main(String[] args)
    {
        for (int i = 1; i<=2; i++)
        {
            System.out.print(i+" --> ");
            for (int j = 65; j<=68; j++)
            {
                System.out.print((char)j+" ");  
            }
            System.out.println();
        }
        for (int i = 3; i<=4; i++)
        {
            System.out.print(i+" --> ");
            for (int j = 68; j>=65; j--)
            {
                System.out.print((char)j+" ");  
            }
            System.out.println();
        }

    }
}