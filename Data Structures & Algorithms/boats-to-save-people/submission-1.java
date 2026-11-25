class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int r = people.length - 1, l = 0;
        int boats = 0;
        while(l <= r) {
            int target = limit - people[r--];
            boats++;
            if(people[l] <= target) l++;
        }
        return boats;                                                                    
    }
}