package exercises.exercise10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadByBlocks {
    public static void main(String[] args) {

        int tmp;
        byte[] buffer = new byte[10];
        FileInputStream in = null;

        try {
            in = new FileInputStream("abc.txt");

            while ((tmp = in.read(buffer)) == buffer.length) {
                System.out.print(new String(buffer));
            }
            for (int i = tmp; i < buffer.length; i++)
                buffer[i] = 0;
            System.out.println(new String(buffer));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
