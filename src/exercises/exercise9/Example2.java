package exercises.exercise9;

import java.util.ArrayList;


public class Example2 {

    private ArrayList<Integer> core = new ArrayList<Integer>();

    public void push(Integer i)
    {
        core.add(i);
    }

    public Integer pop()
    {
        return core.remove( core.size()-1 );
    }

    public Integer peek()
    {
        return core.get( core.size()-1 );
    }

    public boolean isEmpty() {
        return core.isEmpty();
    }

        public static void main(String[] args) {


    }
}
