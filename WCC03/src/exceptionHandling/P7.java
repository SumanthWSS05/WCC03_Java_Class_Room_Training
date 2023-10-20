package exceptionHandling;

import java.io.FileInputStream;    //fully qualified name of a class
import java.io.FileNotFoundException;

public class P7 {

	public static void main(String[] args) {
		System.out.println("main begins");
		readDataFromExternalFile();
//		call(1,2,"");
		System.out.println("main ends");
	}

	public static void readDataFromExternalFile() {
		System.out.println("child method begins");

		try {
			FileInputStream fis = new FileInputStream("E:\\WCC03-Workspace\\Note\\Day - 1.txt");
			System.out.println(fis); 	//fis.toString()
			Thread.sleep(5000);
		} catch (FileNotFoundException e) {
			System.out.println("the path of the file is wrong");
		} catch (InterruptedException e) {
			System.out.println("the thread which was under sleep is bombarded by another thread");
		}

		System.out.println("child method ends");
	}
}
