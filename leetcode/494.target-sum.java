class Solution {
    
    public Map<String, Integer> map = new HashMap<>();

    public  int findTargetSumWays(int[] nums, int target) {

        return backtracking(nums, target, nums.length - 1, 0);
    }
    public  int backtracking(int[] nums, int target, int index, int sum) {
        String key = index + ":" + sum;
        if (map.containsKey(key))
        {
            return (map.get(key));
        }
        if (index < 0)
            return sum == target ? 1 : 0;

        int add = backtracking(nums, target, index - 1, sum + nums[index]);
        int sub = backtracking(nums, target, index - 1, sum - nums[index]);
        map.put(key, add + sub);
        return map.get(key);
    }
}

