package oops.interfaces;

interface Printable{
    void print();
}
interface Drawable{
    void draw();
}
public class MultipleInheritance implements Printable,Drawable {
    public static void main(String[] args) {
      MultipleInheritance obj = new MultipleInheritance();
      obj.draw();
      obj.print();
    }

    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void draw() {
        System.out.println("draw");
    }
}
