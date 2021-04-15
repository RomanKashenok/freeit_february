package info.freeit.input_output.fileInOut;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleFileIOStream {
    public static void main(String[] args) throws IOException {

        try (
                FileInputStream fis = new FileInputStream("example.txt");
                FileOutputStream fos = new FileOutputStream("exampleoutput.txt")
        ) {
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
