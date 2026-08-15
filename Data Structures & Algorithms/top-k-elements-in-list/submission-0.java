class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int n:nums)
        {
            if(map.containsKey(n))
            {
                map.put(n, map.get(n) + 1);
            }
            else
            {
                map.put(n,1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        int[] res = new int[k];
        for(int i = 0; i < k; i++) res[i] = pq.poll();
        return res;
    }
}