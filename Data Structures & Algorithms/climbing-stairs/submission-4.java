class Solution {
    public int climbStairs(int n) {
        int[] mem = new int[n + 1];
        Arrays.fill(mem, -1);
        return helper(n, mem);
    }

    private int helper(int n, int[] mem) {
        if (n <= 1) return 1;
        if (mem[n] != -1) return mem[n]; // Return cached result if present

        return mem[n] = helper(n - 1, mem) + helper(n - 2, mem);
    }
}