package info.freeit.input_output.fileInOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleFileIOStream {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("example.txt");
			fos = new FileOutputStream(new File("exampleoutput.txt"));
			int c;
			while((c = fis.read()) != -1) {
				fos.write(c);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis!=null) fis.close();
			if(fos!=null) fos.close();
		}
	}
}
