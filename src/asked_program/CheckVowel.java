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
        for(int i=0;i<ch.length;i++){
            if (ch[i] == 'a' || ch[i]== 'e' || ch[i]== 'i' || ch[i]== 'o' || ch[i]=='u'){
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