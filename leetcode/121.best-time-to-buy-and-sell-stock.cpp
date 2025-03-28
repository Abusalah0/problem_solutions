class Solution {
    public:
        int maxProfit(vector<int>& nums) {
            if(nums.size() == 1)
                return 0;
    
            int l = 0, r = 1;
            int maxp = 0;
            while(r < nums.size())
            {
                if(nums[l]  < nums[r])
                    {
                        maxp = (maxp > nums[r] - nums[l]) ? maxp : nums[r] - nums[l];
                    }
                else 
                    l = r;
                r++;
            }
            return maxp;
        }
    };