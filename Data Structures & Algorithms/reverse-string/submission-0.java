class Solution {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        for(int i = 0; i < s.length; i++) {

            while(left < right) {
                char c = s[left];
                s[left] = s[right];
                s[right] = c;

                left++;
                right--;
            }
        }

    }
}