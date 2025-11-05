class Solution {
    public boolean isPalindrome(String s) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i)))
                continue;
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                char c = (char) (s.charAt(i) + 32);
                res += c;
            } else
                res += s.charAt(i);
        }
        System.out.println(res);
        int low = 0, high = res.length() - 1;

        while (low <= high) {
            if (res.charAt(low) != res.charAt(high))
                return false;

            low++;
            high--;
        }
        return true;
    }
}