class Solution {
    public boolean isSubsequence(String s, String t) {
        int sub = 0, word = 0;
        while (sub < s.length() && word < t.length()) {
            if (s.charAt(sub) == t.charAt(word)) {
                sub++;
            }
            word++;
        }
        return sub == s.length();
    }
}

// A subsequence of a string is a new string that is formed from the original string 
// by deleting some (can be none) of the characters without disturbing the relative 
// positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
