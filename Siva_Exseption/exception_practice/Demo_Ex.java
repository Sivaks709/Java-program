package exception_practice;

public class Demo_Ex extends Exception{
    public String getMessage() {
        return "Success.";
    }
}

class InnerDemo_Ex extends Exception{

    public String getMessage() {
        return "Error.";
    }
}

 class InnerDemo_Ex_1 {

    public static void name(int num) throws InnerDemo_Ex ,Demo_Ex {
        if (num>=10) {
            throw new Demo_Ex();
        } else {
            throw new InnerDemo_Ex();
        }
    }
    public static void main(String[] args) {
        try {
            name(15);
        } catch (InnerDemo_Ex e) {
            System.out.println(e.getMessage());
        } catch (Demo_Ex e) {
            System.out.println(e.getMessage());
        }
    }
    
}
