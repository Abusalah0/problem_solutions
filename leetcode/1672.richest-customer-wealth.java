class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for(int[] customer : accounts)
        {
            sum = 0;
            for(int n : customer)
            {
                sum += n;
            }
            if (sum > max) 
            {
                max = sum;
            }
        }
        return max;
    }
}