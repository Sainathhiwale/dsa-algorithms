package oops.interfaces;

class  SBI implements Bank{

    @Override
    public double interestOfRate() {
        return 8.7;
    }
}
class HDFC implements  Bank{

    @Override
    public double interestOfRate() {
        return 9.70;
    }
}
class ICICI implements Bank{

    @Override
    public double interestOfRate() {
        return 9.7;
    }
}
class PNB implements Bank{

    @Override
    public double interestOfRate() {
        return 7.6;
    }
}
public class Test {
    public static void main(String[] args) {
         Bank bank = new PNB();
         System.out.println(bank.interestOfRate());

    }
}
