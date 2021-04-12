package info.freeit;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;

public class FilesExample {
    public static void main(String[] args) throws IOException, URISyntaxException {

        File myFile = new File("myfile.dat");
        System.out.println(myFile);
        System.out.println(myFile.getAbsolutePath());
        System.out.println(myFile.getCanonicalPath());
        System.out.println(myFile.isDirectory());

        if (myFile.exists()) {
            boolean deleted = myFile.delete();
            if (deleted) {
                System.out.println("File removed!");
            }
        } else {
            boolean created = myFile.createNewFile();
            if (created) {
                System.out.println("File created!");
            }
        }

    }
}
