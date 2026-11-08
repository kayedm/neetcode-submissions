class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> set = new HashMap<>();

        for(String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedString = new String(charArr);
            set.putIfAbsent(sortedString, new ArrayList<>());
            set.get(sortedString).add(s);
        }

        return new ArrayList<>(set.values());

    }
}
