class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;
        String st = s.toLowerCase();

        while(left < right) {

            while(left < right && !Character.isLetterOrDigit(st.charAt(left))) {
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(st.charAt(right))) {
                right--;
            }
            
            if(st.charAt(left) != st.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
