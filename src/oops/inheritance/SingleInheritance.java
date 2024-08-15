package oops.inheritance;

//parent clas
class  Animal{
  public void eat(){
      System.out.println("eating animal..");
  }
}
//child class
class Dog extends Animal{

    public void bark() {
        System.out.println("barking ");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
      Dog dog = new Dog();
      dog.eat(); // parent method which is called by child class object
         dog.bark();
    }
}
