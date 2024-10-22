package oops.collections_demo;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<Object> arrayList = new ArrayList<>();
        // Adding elements (duplicates allowed)
        arrayList.add("Apple");
        arrayList.add(10);  // Heterogeneous element (Integer)
        arrayList.add("Banana");
        arrayList.add("Apple");  // Duplicate
        arrayList.add(null);  // Multiple null values allowed
        arrayList.add(null);
        // Displaying elements (follows insertion order)
        System.out.println("ArrayList: " + arrayList);

    }
}
