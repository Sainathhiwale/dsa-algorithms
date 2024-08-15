package oops.polymorphism;


 class Parent {
    public void add(int a, int b) {
        System.out.println("parent class is called");
        System.out.println(a+b);
    }

}
class Child extends Parent {

    @Override
    public void add(int a, int b) {
        System.out.println("child class is called");
        System.out.println(a+b);
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
       Child child = new Child();
       child.add(10,10);
    }
}
