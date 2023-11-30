/**
 * GETTER_METHOD
 */
public class GETTER_METHOD {

    private String Name="Siva Kumar";
    private double Salery=50000;
    private static String Password;
    private String Date_Of_Birth;

    GETTER_METHOD(String Password ,String Date_Of_Birth)
    {
        this.Date_Of_Birth=Date_Of_Birth;
        this.Password=Password;
    }
    public static String GET_PASSWORD() {
        return Password;
    }
    public String GET_DOB() {
        return Date_Of_Birth;
    }
    public String GET_NAME() {
        return Name;
    }
    public double GET_SALERY() {
        return Salery;
    }
    public void SET_Password(String Password) {
        this.Password=Password;
    }
    public void SET_DATE_OF_BIRTH(String Date_Of_Birth) {
        this.Date_Of_Birth=Date_Of_Birth;
    }
}