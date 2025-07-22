class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();

        int left = 0;
        int length = 0;
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            while(seen.contains(charArray[i])){
                seen.remove(charArray[left]);
                left++;
            }

            seen.add(charArray[i]);
            length = Math.max(length, seen.size());
        }
        return length;
    }
}