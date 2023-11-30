package abstraction;

abstract class DriveTest {

    public void name() {
       System.out.println("hoooo"); 
    }
}

class InnerDriveTest extends DriveTest{
    static int a[];
    public static void main(String[] args) {
        DriveTest d=new InnerDriveTest();
        d.name();
    }
}