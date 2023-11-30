package vlc;

import java.io.IOException;

public class Source extends Thread{
	public void run() {
		try {
			Vlc1.tableGen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Source t0= new Source();
		Source t1= new Source();
		// Source t2= new Source();
		t0.start();
		t1.start();
		// t2.start();


		
	}

}
