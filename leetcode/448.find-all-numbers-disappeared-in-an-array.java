class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         int i = 0;
         int n = arr.length;
         List<Integer> l = new ArrayList<>();
         while( i < n)
         {
            int c = arr[i]  - 1;
            if(arr[i] <= n && arr[i] != arr[c])
            {
                swap(arr, i, c);
            }
            else
                i+=1;
         }
         for( i = 0; i < n; i ++)
         {
            if(arr[i] - 1 != i)
                l.add(i + 1);
         }
         return l;
    }
    void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}