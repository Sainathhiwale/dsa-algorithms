package oops.inheritance;

//When two or more classes inherits a single class, it is known as hierarchical inheritance.
class Bank{
     public void rateOfInterest(double rateOfInterest){
         System.out.println("Bank::"+rateOfInterest);
     }
}
class SBI extends Bank{
    public void sbiInterest(double rateOfInterest){
        System.out.println("SBI::"+rateOfInterest);
    }
}
class ICICI extends Bank{
    public void iciciInterest(double rateOfInterest){
        System.out.println("icici::"+rateOfInterest);
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
      SBI sbi = new SBI();
      sbi.sbiInterest(10.10);
      // icici
        ICICI icici = new ICICI();
        icici.iciciInterest(8.5);
        Bank bank = new Bank();
        bank.rateOfInterest(7.5);
    }

}
