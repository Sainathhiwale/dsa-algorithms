package oops.collections_demo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        // Adding elements (no duplicates allowed)
        hashSet.add("Apple");
        hashSet.add(String.valueOf(Integer.parseInt("10")));  // Heterogeneous element (Integer)
        hashSet.add("Banana");
        hashSet.add("Apple");  // Duplicate (ignored)
        hashSet.add(null);  // Only one null value allowed
        // Displaying elements (does not follow insertion order)
        System.out.println("HashSet: " + hashSet);

    }
}
