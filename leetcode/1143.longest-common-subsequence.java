class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1.equals(text2))
            return text1.length();
       int[][] c = new int[text1.length()+1][text2.length()+1];

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if(text1.charAt(i - 1) == text2.charAt(j - 1))
                {
                    c[i][j] = c[i - 1][j - 1] + 1;
                }
               
                else
                {
                    c[i][j] = Math.max(c[i][j - 1] , c[i - 1][j]);
                }
            }
        }
        return c[text1.length()][text2.length()];
    }
   
}