package vlc;

import java.io.*;
import java.util.Scanner;

public class Vlc1 {
	static OutputStream fw;
	static Scanner s= new Scanner(System.in);
	public synchronized static void tableGen() throws IOException {
		System.out.println("enter the starting value of the table");
		int start= s.nextInt();
		System.out.println("entere the ending the value of the table");
		int end = s.nextInt();
		fw=new FileOutputStream("E://"+Thread.currentThread().getName()+".txt");
		String data="";
		for (int i = start; i <=end; i++) {
			for (int j = 1; j <=10; j++) {
				data=j+"*"+i+"="+(i*j)+"\n";
				fw.write(data.getBytes());
			}
			fw.write("*********\n".getBytes());
		}
		System.out.println("done.....");
		
	
	}

}
