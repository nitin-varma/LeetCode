class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cntMag = new int[26];
        int[] cntRan = new int[26];

        for (char c : magazine.toCharArray())
            cntMag[c - 'a']++;
        for (char c : ransomNote.toCharArray())
            cntRan[c - 'a']++;

        for (int i = 0; i < 26; i++)
            if (cntRan[i] > cntMag[i])
                return false;
        return true;
    }
}