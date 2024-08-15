package oops.inheritance;
//grandparent class
//When there is a chain of inheritance, it is known as multilevel inheritance.
class Vehicle{
    public void startEngine() {
        System.out.println("Starting engine...");
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }

    public void brake() {
        System.out.println("Braking...");
    }

}
//Parent class
class  Car extends  Vehicle{
    public void honkHorn() {
        System.out.println("Honking horn...");
    }
}
// Child class
class Nexon extends Car {
    public void adjustClimateControl() {
        System.out.println("Adjusting climate control...");
    }
}
public class MultilevelInheritance {

    public static void main(String[] args) {
        Nexon nexon = new Nexon();
        nexon.adjustClimateControl(); // child class nexon function
        nexon.honkHorn(); // Car parent class function
        nexon.accelerate(); // grandparent class function
        nexon.startEngine(); // grandparent class function
        nexon.brake(); // grandparent class function

    }
}
