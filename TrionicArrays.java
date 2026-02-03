public class TrionicArrays {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (nums[0] >= nums[1]) {
            return false;
        }
        int count = 1;
        for (int i = 2; i < n; i++) {
            if (nums[i - 1] == nums[i]) {
                return false;
            }
            if ((nums[i - 2] - nums[i - 1]) * (nums[i - 1] - nums[i]) < 0) {
                count++;
            }
        }
        return count == 3;  
    }



    public static void main(String[] args) {
        TrionicArrays sol = new TrionicArrays();
        
        int[] nums1 = {1, 3, 2};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {3, 1, 2};
        
        System.out.println(sol.isTrionic(nums1)); // true
        System.out.println(sol.isTrionic(nums2)); // false
        System.out.println(sol.isTrionic(nums3)); // false
    }
}