import java.util.HashMap;
import java.util.Map;

class MaxSum {
       public int maxSum(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        int maxSum = 0;
        boolean hasPositive = false;
        int maxSingle = Integer.MIN_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int value = entry.getKey();
            int freq = entry.getValue();
            
            maxSingle = Math.max(maxSingle, value);
            
            if (value > 0) {
                maxSum += value;
                hasPositive = true;
            }
        }
        
        return hasPositive ? maxSum : maxSingle;
    }
}