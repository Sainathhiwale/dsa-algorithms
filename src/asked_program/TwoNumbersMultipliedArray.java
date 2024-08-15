package asked_program;

public class TwoNumbersMultipliedArray {
    public static void main(String[] args) {
        int[] num = { 2, 5, 6, -6, 16, 2, 3, 6, 5, 3 };
        System.out.println(sumAryMultiple(num));
    }
    private static String sumAryMultiple(int[] ary) {
        int size = ary.length;
        int total = 0;
        for (int  i=0;i<size; i++){
            total = total + ary[i];
        }
        total = total *2;
        for (int x = 0; x < size - 1; x++)
        {
            for (int y = x + 1; y < size; y++)
            {
                if (ary[x]*ary[y] > total)
                {
                    return "true";
                }
            }
        }

        return "false";
    }

}

/*have the function SumMultiplier(arr) take the array of numbers stored in arr and return the string true if any two numbers can be multiplied so that the answer is greater than double the sum of all the elements in the array. If not, return the string false. For example: if arr is [2, 5, 6, -6, 16, 2, 3, 6, 5, 3] then the sum of all these elements is 42 and doubling it is 84. There are two elements in the array, 16 * 6 = 96 and 96 is greater than 84, so your program should return the string true.
 */