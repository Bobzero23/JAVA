package exercises.exercise10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFile {

    public static void main(String[] args) {
        int tmp;
        FileInputStream in = null;
        try {
            in = new FileInputStream("abc.txt");
            while ((tmp = in.read()) != -1) {
                System.out.print((char) tmp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}