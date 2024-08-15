package oops.class_oops;

public class ClassDemo {
   private int age ;
   private String name;
   private String address;
   private double salary;

    public ClassDemo(int age, String name, String address, double salary) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public void display(){
        System.out.println("age::"+age);
        System.out.println("name::"+name);
        System.out.println("address:"+address);
        System.out.println("Salary::"+salary);
    }

    public static void main(String[] args) {
        ClassDemo object = new ClassDemo(23,"sainath","Pune",18.6);
        object.display();
        object.age = 24;
        object.name = "Mahesh";
        object.address = "Pune";
        object.salary = 19.6;
        System.out.println(object.age);
        System.out.println(object.name);
        System.out.println(object.address);
        System.out.println(object.salary);

    }
}
