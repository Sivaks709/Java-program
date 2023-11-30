public class Exception_Handling {
    public static void main(String[] args) {
        try {
            name(0);
        } catch (Exception e) {
            System.out.println("Main Method Fix The Exception...");
        }
    }
    public static void name(int num) {
        // try {
            
            
        // } catch (Exception e) {
        //     System.out.println("Calling The Method Fix The Exception...");
        // }
        System.out.println(10/num);
    }
}
