package filehandling;

import java.io.FileOutputStream;

public class FileOutput {

	public static void main(String[] args) {
		try {
			FileOutputStream f1=new FileOutputStream("anu.txt");
			String s1="divya bogru";
			byte B1[]=s.getBytes();
			f1.write(B1);
			System.out.println("success.......");
		}
	}

}
