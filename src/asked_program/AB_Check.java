package asked_program;

public class AB_Check {
    public static void main(String[] args) {
        String str = "lane borrowed";

        System.out.println(checkAB(str));
    }

    private static boolean checkAB(String str) {
     char [] chars = str.toCharArray();
     for(int i=0;i<chars.length;i++){
         if(chars[i] =='a' && (i+4)<chars.length  &&  chars[i+4]=='b'){
             return true;
         }else if (chars[i]=='b' && (i+4)<chars.length && chars[i+4] =='a'){
             return true;
         }
     }
     return false;
    }
}

/*Have the function ABCheck(str) take the str parameter being passed and return the string true if the
  characters a and b are separated by exactly 3 places anywhere in the string at least once
  (ie. "lane borrowed" would result in true because there is exactly three characters between a and b).
  Otherwise return the string false.*/
// 1. take char array convert string into char array using toCharArray() method
//2. take the loop to iterate the char array anc check the distance between a and b char given string input.
