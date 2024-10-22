package oops.collections_demo;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("sainath");
        arrayList.add("om");
        arrayList.add("ganesh");
        arrayList.add("pankaj");
        arrayList.add("kailas");
        arrayList.add("bhagwan");
        for (String name:arrayList){
            System.out.println(name);
        }
        System.out.println("index of arraylist element:"+ arrayList.get(0));
        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
