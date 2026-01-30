class MaxScoreRemoveSubstring {
    public int maximumGain(String s, int x, int y) {
        if (x < y) {
            return removeSubstring(s, 'b', 'a', y) + removeSubstring(remaining, 'a', 'b', x);
        } else {
            return removeSubstring(s, 'a', 'b', x) + removeSubstring(remaining, 'b', 'a', y);
        }
    }

    private String remaining;

    private int removeSubstring(String s, char first, char second, int points) {
        StringBuilder stack = new StringBuilder();
        int score = 0;
        
        for (char c : s.toCharArray()) {
            if (c == second && stack.length() > 0 && stack.charAt(stack.length() - 1) == first) {
                stack.deleteCharAt(stack.length() - 1);
                score += points;
            } else {
                stack.append(c);
            }
        }
        
        remaining = stack.toString();
        return score;
    }
}