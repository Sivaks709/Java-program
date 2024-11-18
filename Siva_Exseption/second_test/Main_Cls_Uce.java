package second_test;

public class Main_Cls_Uce {
    public static void Voteing(int n){
        try{
            if(n>=18) throw new Voting_Process_Success();
            else throw new Voting_Process_Failed();
        }
        catch(Voting_Process_Success e){
            System.out.println(e.getMessage());
        }
        catch(Voting_Process_Failed e){
            System.out.println(e.getMessage());
        }
    } 

    public static void main(String[] args) {
        Main_Cls_Uce.Voteing(17);
    }
}
