class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder com = new StringBuilder();
        int l = 0;
        while(l < word1.length() || l < word2.length()) {
            if(l < word1.length()) com.append(word1.charAt(l));
            if(l < word2.length()) com.append(word2.charAt(l));
            l++;
        }
        return com.toString();
    }
}