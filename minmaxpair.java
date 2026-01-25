import java.util.*;
public class minmaxpair{
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int maxPairSum = 0;
        int n = nums.length;
        
        for (int i = 0; i < n / 2; i++) {
            maxPairSum = Math.max(maxPairSum, nums[i] + nums[n - 1 - i]);
        }
        
        return maxPairSum;
    }

    public static void main(String[] args) {
        minmaxpair sol = new minmaxpair();

        int[] test1 = {3, 5, 2, 3};
        System.out.println("Test Case 1: " + sol.minPairSum(test1)); // Expected: 7

        int[] test2 = {3, 5, 4, 2, 4, 7};
        System.out.println("Test Case 2: " + sol.minPairSum(test2)); // Expected: 8
    }
    
}
