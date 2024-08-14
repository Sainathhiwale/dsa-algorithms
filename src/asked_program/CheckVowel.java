package asked_program;

public class CheckVowel {
    public static void main(String[] args) {
     String str = "Sainathhiwale";
     int count = checkVowelCount(str);
        System.out.println(count);
    }

    private static int checkVowelCount(String str) {
        int count =0;
        char [] ch = str.toCharArray();
        for (char c : ch) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}

// vowel - aeiou
/*
 check the str vowel count
*/