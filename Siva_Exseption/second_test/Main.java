package second_test;

public class Main {
    public void vote(int n) throws Cr_Ex, InnerCr_Ex {
        if (n>18) {
            throw new Cr_Ex();
        }
        else
            throw new InnerCr_Ex();
        
    }
    public static void main(String[] args) {
        try {
            Main foo = new Main();
            foo.vote(19);
            
        } catch (Cr_Ex e) {
            System.out.println("Succes");
        }
        catch(InnerCr_Ex e){
            System.out.println("Error");
        }
    }
}
