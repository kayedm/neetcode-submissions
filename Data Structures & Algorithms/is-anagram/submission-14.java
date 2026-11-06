class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for(char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        } 

        for(char c : t.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) - 1);
        }

        for(var c : charCount.entrySet()) {
            if(c.getValue() != 0) return false;
        }

        return true;
    }
}
