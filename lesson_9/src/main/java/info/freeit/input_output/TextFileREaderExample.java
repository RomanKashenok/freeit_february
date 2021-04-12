package info.freeit.input_output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TextFileREaderExample {
    public static void main(String[] args) {

        File file = new File("task.txt");

        try (BufferedReader bis = new BufferedReader(new FileReader(file))) {
            int text = bis.read();
            while (text != -1) {
                System.out.print((char)text);
                text = bis.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
