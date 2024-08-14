package asked_program;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        List<String> output = new Fizzbuzz().fizzBuzz(num);
        System.out.println(output);
    }

    public List<String> fizzBuzz(int[] n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}
/*Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
*/