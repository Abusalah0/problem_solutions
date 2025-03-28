class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int ctr = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                ctr++;
        }
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < ctr ; i++) {
            output.append('1');
        }
        for (int i = 0; i < s.length() - ctr; i++) {
            output.append('0');
        }
        output.append('1');
        return output.toString();
    }
}