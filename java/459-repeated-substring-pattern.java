class Solution {
    public boolean repeatedSubstringPattern(String s) { //aba //abab
        String doubled = s + s;
        String substr = doubled.substring(1, doubled.length() - 1); //abaaba -> baab (dont contain aba) //abababab -> bababa (contains abab)
        return substr.contains(s);
    }
}