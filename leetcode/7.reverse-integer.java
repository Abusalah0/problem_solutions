class Solution {
    public int reverse(int x) {
        
        boolean flag = false;
        if ( x < 0)
        {
            x = x * -1;
            flag = true;
        }
        long reversed = 0; 
        for(int i = x; i > 0; i /=10)
        {
            reversed = reversed * 10 + i % 10;
        }

        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE )
            return 0;

        return (flag) ? (int)reversed * -1 : (int) reversed;
    }
}