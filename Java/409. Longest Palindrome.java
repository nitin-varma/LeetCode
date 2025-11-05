class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        HashSet<Character> hs = new HashSet<Character>();

        for (char c : s.toCharArray()) {
            if (hs.contains(c)) {
                length += 2;
                hs.remove(c);
            } else {
                hs.add(c);
            }
        }

        if (!hs.isEmpty())
            length += 1;

        return length;
    }
}

class Solution {
    public int longestPalindrome(String s) {
        int[] cnt = new int[128];
        int odd = 0;
        for (char c : s.toCharArray()) {
            cnt[c]++;
        }
        for (int n : cnt)
            if (n % 2 == 1)
                odd++;

        if (odd > 1)
            return s.length() - odd + 1;

        return s.length();
    }
}
