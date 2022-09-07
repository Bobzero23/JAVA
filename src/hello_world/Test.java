package hello_world;

/*Given a string, if the string "del" appears starting at index 1,
 return a string where that "del" has been deleted. Otherwise,
 return the string unchanged.*/

public class Test {

  static String delDel(String str) {
        if(str.length() >= 4 && str.substring(1,4).equals("del")){
            return str.charAt(0) + str.substring(4);
        }else return str;
    }

    public static void main(String[] args) {
        System.out.println(delDel("Bdelobzero"));
    }
}
