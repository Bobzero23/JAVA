package exercises.exercise9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example_HashMap {
    public static void main(String[] args) {
        // Create a HashMap to store revenue data
        HashMap<String, Double> revenueMap = new HashMap<>();

        // Add revenue data for different departments
        revenueMap.put("Sales", 50000.0);
        revenueMap.put("Marketing", 35000.0);
        revenueMap.put("Finance", 45000.0);
        revenueMap.put("HR", 30000.0);
        revenueMap.put("IT", 40000.0);

        // Method 1: Using keySet() to iterate over keys and get corresponding values
        System.out.println("Iterating using keySet():");
        for (String department : revenueMap.keySet()) {
            double revenue = revenueMap.get(department);
            System.out.println(department + " : " + revenue);
        }

        // Method 2: Using entrySet() to iterate over key-value pairs
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<String, Double> entry : revenueMap.entrySet()) {
            String department = entry.getKey();
            double revenue = entry.getValue();
            System.out.println(department + " : " + revenue);
        }

        // Method 3: Using iterator() to iterate over key-value pairs
        System.out.println("\nIterating using iterator():");
        Iterator<Map.Entry<String, Double>> iterator = revenueMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            String department = entry.getKey();
            double revenue = entry.getValue();
            System.out.println(department + " : " + revenue);
        }
    }
}

