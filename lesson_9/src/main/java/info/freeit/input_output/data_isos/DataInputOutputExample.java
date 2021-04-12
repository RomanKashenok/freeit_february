package info.freeit.input_output.data_isos;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputExample {
	public static void main(String[] args) throws IOException {
		
		DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream("datafile.txt"));

		StringBuffer br = new StringBuffer();

		for (int i = 0; i < 4; i++) {
			dataOutput.writeInt(99);
			dataOutput.writeDouble(99.99);
			dataOutput.writeUTF("Тест " + i);
			dataOutput.writeBoolean(true);
		}
		dataOutput.close();

		DataInputStream dataInput = new DataInputStream(new BufferedInputStream(new FileInputStream("datafile.txt")));
		while (dataInput.available() > 0) {
			int first = dataInput.readInt();
			double second = dataInput.readDouble();
			String third = dataInput.readUTF();
			boolean fourth = dataInput.readBoolean();

			System.out.println(first + " " + second + " " + third + " " + fourth);
		}

		dataInput.close();
	}
}
