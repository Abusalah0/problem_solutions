class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n)
        {
            int correct = nums[i] ;
           
            if(nums[i] < n && nums[i] != nums[correct])
            {
                swap(nums, i, correct);
            }
            else
            {
                i++;
            }
        }
        for(i = 0; i < n; i++)
            if(nums[i] != i )
                return i;
        return n;
    }
    void swap(int[] arr, int from, int to)
    {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}