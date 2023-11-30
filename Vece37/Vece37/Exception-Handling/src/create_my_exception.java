public class create_my_exception {
    public static void main(String[] args) throws OutOfMemoryError, HaveApatienceException {
        name(20);
    }
    public static void name(int a) {
        if (a<21) {
            try {
                throw new HaveApatienceException();
            } catch (HaveApatienceException e) {
                System.out.println("go to school");
                e.printStackTrace();
            }
        }
        else if(a>40)
        {
            try {
                throw new OutOfserviceException();
            } catch (OutOfserviceException e) {
                System.out.println("Better Luck Next Time");
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Congratulatins");
        }
    }
}

class HaveApatienceException extends Exception{
    @Override
    public String getMessage() {
        
        return super.getMessage()+" "+"Not Eligible";
    }
    @Override
    public String getLocalizedMessage() {
        // TODO Auto-generated method stub
        return super.getLocalizedMessage();
    }
}