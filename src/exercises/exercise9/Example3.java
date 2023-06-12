package exercises.exercise9;

import java.util.ArrayList;

public class Example3 {

    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<Integer>();

        for(int i=0; i<95 ; i++) tab.add(i%5);

        for(int i=tab.size()-1 ; i>=0 ; i-=5) tab.remove(i);
    }
}
