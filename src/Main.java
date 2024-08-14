// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int count =0;
       String str = "Sainath";
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(ch == 'a' || ch =='i' || ch=='e' || ch =='o' || ch =='u'){
               count++;
           }
       }
        System.out.println(count);
    }
}