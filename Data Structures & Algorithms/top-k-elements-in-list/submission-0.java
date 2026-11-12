class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) ->  a[0] - b[0]);
        for(var entry : map.entrySet()) {
            queue.offer(new int[]{entry.getValue(), entry.getKey()});
            if(queue.size() > k) {
                queue.poll();
            }
        }
        
        int[] freq = new int[k];

        for(int i = 0; i < k; i++) {
            freq[i] = queue.poll()[1];
        }

        return freq;
    }
}
