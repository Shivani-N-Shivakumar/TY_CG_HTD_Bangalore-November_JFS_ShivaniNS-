package filehandling;

import java.io.IOException;

public class FileInputStream {

	public static void main(String[] args) {
		
		try {
			FileInputStream f1=new FileInputStream("anu.txt");
			int j=0;
			while((j=f1.read())!=-1) {
				System.out.println((char)j);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
