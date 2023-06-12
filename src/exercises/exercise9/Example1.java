package exercises.exercise9;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("abc1");
        myList.add("abc2");
        myList.add("abc3");
        System.out.println("Printing list data : ");
        for(int i=0; i<myList.size() ; i++)
        {
            System.out.println(myList.get(i));
        }

    }
}
