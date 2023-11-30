package exception_practice;

public class Voteing_Process_Success extends Exception{
   
}

class Voteing_Process_Filed extends Throwable{

    public String getMessage() {
        System.out.println("Voteing Process Filed");
        return "";
    }
}
