class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            int curr = magazine.indexOf(c);

            if (curr == -1)
            {
                return false;
            }

            magazine = magazine.substring(0, curr) + magazine.substring(curr + 1);

        }
        return true;
    }
}