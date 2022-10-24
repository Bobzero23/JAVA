package hello_world;

/*Given a string, if the string "del" appears starting at index 1,
 return a string where that "del" has been deleted. Otherwise,
 return the string unchanged.*/

import java.util.Random;

public class Test {

    public static void main(String[] args) {

        int i;
        int[] rastgele = new int[100];
        for ( i = 1; i < 10; i++){
            Random random = new Random();
            System.out.print(random.nextInt(1,100) + ", ");
        }
    }
}
