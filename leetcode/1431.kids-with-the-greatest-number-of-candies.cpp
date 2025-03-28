class Solution {
    public:
        vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
            int max = candies[0];
            int n = candies.size();
            for(int i = 1; i < n; i++)
            {
                if(candies[i] > max)
                    max = candies[i];
            }
            vector<bool> result(n);
            for(int i = 0;i < n; i++)
            {
                if(candies[i] + extraCandies >= max)
                    result[i] = true;
                else
                    result[i] = false;
            }
            return result;
        }
    };