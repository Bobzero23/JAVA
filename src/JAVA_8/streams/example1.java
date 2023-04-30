package JAVA_8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class example1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Murat", "Umit", "Recep", "Burak", "Rajabu", "Ayse", "Rashid", "Rahma");
        List<String> myStreamList = list.stream().sorted(Comparator.reverseOrder())
                .filter(item -> item.startsWith("R")).map(String::toUpperCase).toList();
        myStreamList.forEach(System.out::println);
    }
}
