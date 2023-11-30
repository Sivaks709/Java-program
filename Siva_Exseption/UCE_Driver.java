public class UCE_Driver {

    public static void main(String[] args) 
    {
        try
        {
            Voting(1);
        }
        catch (Votting_Success e)
        {
            System.out.println("Your Votting Success...");
        }
        catch (User_Creating_Exception e)
        {
            System.out.println("Your Age Is 18 Below....");
        }
        finally{
            System.out.println("Thanks For Useing My Service...");
        }
    }
    public static int Voting(int num) throws Votting_Success, User_Creating_Exception{
        if (num >= 18)
        {
            throw new Votting_Success();
        }
        else
        {
            throw new User_Creating_Exception();
        }
    }
}
