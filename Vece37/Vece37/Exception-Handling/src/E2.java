//Exception Not Handled
public class E2 {

	public static void main(String[] args) {
		System.out.println("Planned Start...");
		int []a= {1,2,3};
		System.out.println(1);
		System.out.println(2);
		System.out.println(a[12]);//Abnormal Stmt JVM (AIOBE)
		System.out.println(3);
		System.out.println("Planned Stop");
		
	}
}
/*
Planned Start
1
2
AIOBE
*/    //Here Exception Occured And Not Handled