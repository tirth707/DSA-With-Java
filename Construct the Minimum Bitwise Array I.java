public class Construct the Minimum Bitwise Array I {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            int target = nums.get(i);
            boolean found = false;
            
            // Check all values from 0 to target-1 to find the minimum x
            for (int x = 0; x < target; x++) {
                if ((x | (x + 1)) == target) {
                    ans[i] = x;
                    found = true;
                    break; // Found the minimum, move to the next nums[i]
                }
            }
            
            if (!found) {
                ans[i] = -1;
            }
        }
        
        return ans;
        
    }
    
}
