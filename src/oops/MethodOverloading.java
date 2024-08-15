package oops;

class Addition{
    public int add(int a, int b){
        return  a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public String add(String name, String lastName){
        return name+lastName;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(10,10));
        System.out.println(addition.add(5.5,5.5));
        System.out.println(addition.add("Sainath"," Hiwale"));
    }
}
