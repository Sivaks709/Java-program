//Concat the String
public class S3 {

	public static void main(String[] args) {
		String s1="Java";
		String s2=" Script";
		String res=s1.concat(s2);
		System.out.println(s1);//Java
		System.out.println(res);//Java Script
		System.out.println(s2);//Script
		System.out.println("*****************");
		String a="J2EE";
		String b="J2ME ";
		// b+=a;
		b=b+a;
		// b="J2ME"+"J2EE"-->"J2ME J2EE"
		System.out.println(b);
	}
}
