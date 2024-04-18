import java.util.ArrayList;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
      /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
        Scanner in = new Scanner(System.in);

        // Prompt user for the number of integers
        int numOfIntegers = in.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        // Loop to get input integers
        for (int i = 0; i < numOfIntegers; i++) {
            int num = in.nextInt();
            nums.add(num);
        }

        int maxCount = 0;
        int mode = Integer.MIN_VALUE;

        // Loop to find mode
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(j) == nums.get(i)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = nums.get(i);
            }
        }
        
        System.out.println(mode);
    }
}
