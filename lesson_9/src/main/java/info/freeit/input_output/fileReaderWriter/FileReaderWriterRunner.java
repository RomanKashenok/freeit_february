package info.freeit.input_output.fileReaderWriter;

import java.io.*;

public class FileReaderWriterRunner {
    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("connection_log.txt");
                FileReader fr2 = new FileReader("connection_log2.txt");
                FileWriter fw = new FileWriter("connection_log_copy.txt");
                FileWriter fw2 = new FileWriter("connection_log_copy2.txt")
        ) {
            File file = new File("connection_log.txt");
            System.out.println("file size = " + file.length());

            long start = System.currentTimeMillis();
            int a;
            while ((a = fr.read()) != -1) {
				fw.write(a);
            }
            System.out.println(System.currentTimeMillis() - start);


            start = System.currentTimeMillis();
			BufferedReader br = new BufferedReader(fr2);
			String res = "";
			while (res != null) {
				res = br.readLine();
				if(res != null) {
				    fw2.write(res);
                }
			}
            System.out.println(System.currentTimeMillis() - start);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
