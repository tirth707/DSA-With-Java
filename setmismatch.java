
import java.util.Arrays;
public class setmismatch {
    public int[] findErrorNums(int[] nums) {
        int duplicate = -1;
        int missing = -1;

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (nums[val - 1] < 0) {
                duplicate = val;
            } else {
                nums[val - 1] = -nums[val - 1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        setmismatch sol = new setmismatch();
        
        int[] testCase1 = {1, 2, 2, 4};
        int[] result1 = sol.findErrorNums(testCase1);
        System.out.println("Input: [1, 2, 2, 4] -> Output: " + Arrays.toString(result1));

        int[] testCase2 = {1, 1};
        int[] result2 = sol.findErrorNums(testCase2);
        System.out.println("Input: [1, 1] -> Output: " + Arrays.toString(result2));
    }
}
    

