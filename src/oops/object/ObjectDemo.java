package oops.object;

public class ObjectDemo {
    private int age ;
    private String name;
    private String address;
    private double salary;

    public ObjectDemo(int age, String name, String address, double salary) {
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
        ObjectDemo objectDemo = new ObjectDemo(23,"Mahesh","Pune",23.5);
        objectDemo.display();
    }

}
