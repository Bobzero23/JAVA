package exercises.exercise10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingFile {

    public static void main(String[] args) {

        String str = "Something to write into a file";
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("abc2.txt");
            // writing byte after byte
            for (int i = 0; i < str.length(); i++)
                out.write(str.charAt(i));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}