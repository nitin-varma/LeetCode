class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int n : nums)
            hs.add(n);

        int max = 0;
        for (int n : hs) {
            int streak = 0;
            if (!hs.contains(n - 1)) {
                streak = n;
                while (hs.contains(streak + 1)) {
                    streak += 1;
                }
                max = Math.max(max, streak - n + 1);
            }
        }
        return max;
    }
}
