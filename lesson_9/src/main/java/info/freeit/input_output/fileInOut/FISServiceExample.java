package info.freeit.input_output.fileInOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FISServiceExample {

	public static byte[] readAllBytesFromFile(String fileLocation) throws IOException {
		
		File file = new File(fileLocation);
		
		FileInputStream fis = new FileInputStream(file);
		
		byte[] byteArray = new byte[fis.available()];
		
		for(int i = 0; i < byteArray.length; i++) {
			byteArray[i] = (byte) fis.read();
		}
		fis.close();
		return byteArray;
	}

}
