package exercises.exercise10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyingFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter file you want to copy:");
        String file_src = sc.nextLine();
        System.out.print("enter name of destination file :");
        String file_dsc = sc.nextLine();

        FileInputStream in=null;
        FileOutputStream out=null;
    }
}
