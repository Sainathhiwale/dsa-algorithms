package dsa.string;
//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringAlternately {

    public static void main(String[] args) {
       String word1= "abc";
       String word2 = "pqr";
       String mergeStr = mergeAlternately(word1,word2);
        System.out.println(mergeStr);
    }

    private static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(word1.length(),word2.length());
        for (int i=0;i<minLength;i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        // Add remaining characters from the longer string, if any
        if (word1.length() > minLength) {
            result.append(word1.substring(minLength));
        } else if (word2.length() > minLength) {
            result.append(word2.substring(minLength));
        }
       return result.toString();
    }
}
