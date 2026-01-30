import java.util.HashSet;
import java.util.Set;

class MaxErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int maxSum = 0;
        int currSum = 0;
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            while (seen.contains(num)) {
                seen.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
            seen.add(num);
            currSum += num;
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}