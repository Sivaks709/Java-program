package exception_practice;

public class User_Define_Exception_Main {
    public static void main(String[] args) {
        User_Define_Exception_Main ref = new User_Define_Exception_Main();
        try {
            ref.registerVoteID(1);
        } catch (Voteing_Process_Success e) {
            System.out.println("Voteing Process Success");
        } catch (Voteing_Process_Filed e) {
            e.getMessage();
        }
    }
    public void registerVoteID(int age) throws Voteing_Process_Success, Voteing_Process_Filed {
        if (age >= 18) {
            throw new Voteing_Process_Success();
        } else {
            throw new Voteing_Process_Filed();
        }
    }
}
