public class GETTER_METHOD_DRIVE {

    static GETTER_METHOD ref=new GETTER_METHOD("Siva@709",
     "06/10/2001");
     
     public static void main(String[] args) {
        System.out.println(ref.GET_NAME());
        System.out.println(ref.GET_SALERY());
        System.out.println(ref.GET_PASSWORD());
        System.out.println(ref.GET_DOB());
        System.out.println("##########################################");
        ref.SET_DATE_OF_BIRTH("06/07/2001");
        System.out.println("YOUR NEW DOB IS CHEANG : "+ref.GET_DOB());
        ref.SET_Password("SiVaks@709");
        System.out.println("YOUR NEW PASSWORD IS : "+ref.GET_PASSWORD());
     }
}
