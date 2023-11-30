public class Throws_creation {
    public void DrivingLicence(int a){
        if (a>18) {
            try {
                throw new Accept_Your_Record();
            } catch (Accept_Your_Record e) {
                System.out.println("Pleace Check Properly");
                e.printStackTrace();
            }
        }
        else if(a<18){
            try {
                throw new You_Are_Waiting_List();
            } catch (You_Are_Waiting_List e) {
                System.out.println("Pleace Wait Few Years");
                e.printStackTrace();
            }
        }
    }
}
class Accept_Your_Record extends Exception
{
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class You_Are_Waiting_List extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class Driving
{
    public static void main(String[] args)  {
        Throws_creation ref =new Throws_creation();

        ref.DrivingLicence(5);
    }
}
