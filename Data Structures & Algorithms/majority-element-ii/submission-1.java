public class Solution {
    public List<Integer> majorityElement(int[] nums) {
      int count1 = 0, count2 = 0, num1 = 0, num2 = 0;

      for(int n : nums) {
        if(n == num1) {
            count1++;
        } else if (n == num2) {
            count2++;
        } else if (count1 == 0) {
            num1 = n;
            count1 = 1;
        } else if (count2 == 0) {
            num2 = n;
            count2 = 1;
        } else {
            count1--;
            count2--;
        }
      }

        count1 = count2 = 0;
        for(int n : nums) {
            if(n == num1) {
                count1++;
            } else if (n == num2) {
                count2++;
            }
        }

        List<Integer> list = new ArrayList<>();
        if(count1 > nums.length / 3) list.add(num1);
        if(count2 > nums.length / 3) list.add(num2);

        return list;
    }
}