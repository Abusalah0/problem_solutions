class Solution {
    public int firstMissingPositive(int[] nums) {
        int size = nums.length;
        int i = 0;
        while(i < size)
        {
            int Inx = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= size && nums[i] != nums[Inx])
            {
               swap(nums, i, Inx);
            }
            else
            {
                i++;
            }
        }

        for(i = 0; i < size; i++)
        {
            if(nums[i] != i + 1)
                return i + 1;
        }
        return size + 1;
    }
    void swap(int arr[], int target, int dist)
    {
        int temp = arr[target];
        arr[target] = arr[dist];
        arr[dist] = temp;

    }
}