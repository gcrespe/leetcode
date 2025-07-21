class Solution {
    public List<Integer> intersection(int[][] nums) {
Map<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int totalArrays = nums.length;
        
        for (int[] array : nums) {
            for (int num : array) {
                int newCount = count.getOrDefault(num, 0) + 1;
                count.put(num, newCount);
                
                if (newCount == totalArrays) {
                    result.add(num);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}