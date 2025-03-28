class Solution {
    public int search(int[] nums, int target) {
       
        int l = 0, r = nums.length - 1;
        int md;
        while (l <= r)
        {
            md = (r + l) / 2;
            if( nums[md] == target)
                return md;
            else if (nums[md] > target)
                r = md -1;
            else
                l = md  + 1;
            
        }
        return -1;
    }
}