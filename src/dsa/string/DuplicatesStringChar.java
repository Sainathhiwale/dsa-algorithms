package dsa.string;

public class DuplicatesStringChar {
    public static void main(String[] args) {
        String str = "This is a string with duplicate characters!";
        findDuplicates(str);
    }

    private static void findDuplicates(String str) {
      char [] chars = str.toCharArray();
      int [] charCount = new int[256];
      for (char ch : chars){
         charCount[ch]++;
      }
        for (int i=0;i<charCount.length;i++){
            if (charCount[i]>1){
                System.out.print((char) i );
            }
        }
    }
}
