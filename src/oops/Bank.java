package oops;
// multilevel inheritance demo
class Rate{
    public void rate(double interesrate){
        System.out.println(interesrate);
    }
}
class SBI extends Rate{
    @Override
    public void rate(double interesrate) {
        System.out.println("SBI::"+interesrate);
    }
}
class ICICI extends Rate{

    @Override
    public void rate(double interesrate) {
        System.out.println("ICICI::"+interesrate);
    }
}

public class Bank {
    public static void main(String[] args) {
      ICICI object = new ICICI();
      object.rate(10.5);
      SBI sbi = new SBI();
      sbi.rate(8.1);

    }
}
