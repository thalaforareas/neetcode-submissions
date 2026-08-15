class Solution {
    public int longestConsecutive(int[] nums) {
        // 1. Handle edge case for empty arrays
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 2. Add all numbers to a HashSet for O(1) lookups
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        // 3. Iterate through the set
        for (int num : set) {
            
            // 4. Check if 'num' is the start of a sequence
            // We only build a streak if the previous number IS NOT in the set
            if (!set.contains(num - 1)) {
                
                int currentNum = num;
                int currentStreak = 1;

                // 5. Count upwards to find the end of the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // 6. Update our maximum streak tracker
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}