package info.freeit.input_output;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GithubReader {
    public static void main(String[] args) throws IOException {

//        URL url = new URL("https://raw.githubusercontent.com/RomanKashenok/freeit_february/main/lesson_1/HelloWorld.java");
//
//        URLConnection connection = url.openConnection();
//        connection.connect();
//
//        InputStream inputStream = connection.getInputStream();
//
//        InputStreamReader reader = new InputStreamReader(inputStream);
//
//        int read = reader.read();
//        while (read != -1) {
//            System.out.print((char) read);
//            read = reader.read();
//        }


//        try {
//            URLConnection uc;
//            uc = url.openConnection();
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
//            String line = null;
//            while ((line = reader.readLine()) != null)
//            System.out.println(line);
//
//        } catch (IOException e) {
//            System.out.println("Some error");
//        }

    }
}
