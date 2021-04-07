package info.freeit.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class RunnerWithException {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("exceptionalfile2.file");
            String firstArg = args[0];
            //....
            //....
            //....
            //....
            //....
        } catch (FileNotFoundException | IndexOutOfBoundsException | ArithmeticException exception) {
            try {
                throw new FileBadNameOrAbsentException("Наверное вы ошиблися");
            } catch (FileBadNameOrAbsentException e) {
                e.printStackTrace();
            }
        }

        System.out.println("File was found or not!");

    }
}
