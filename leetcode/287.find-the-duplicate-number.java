class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        int n = arr.length;

        while(i < n)
        {
            int c = arr[i] - 1;
            if(arr[i] != arr[c] )
            {
                swap(arr, i, c);
            }
            else if (arr[i] == arr[c] && c != i)
            {
                return arr[i];
            }
            else
                i++;
        }
        return 0;
    }
    void swap(int[] arr, int i, int c)
    {
        int temp = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }
}