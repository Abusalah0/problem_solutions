class Solution {
    public int trap(int[] height) {
        if(height.length == 0)
            return 0;
        int l = 0; 
        int r = height.length - 1;

        int lmax = height[l];
        int rmax = height[r];

        int sum = 0;

        while(l < r)
        {
            if (lmax < rmax)
            {
                l+=1;
                lmax = Math.max(lmax, height[l]);
                sum += lmax - height[l];
            }
            else
            {
                r-=1;
                rmax = Math.max(rmax, height[r]);
                sum += rmax - height[r];
            }
        }
            return sum;

    }
}