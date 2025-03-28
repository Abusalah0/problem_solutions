class Solution {
    public List<Integer> findDuplicates(int[] arr) {
           //cycle sort
       
        int n = arr.length;
        List<Integer > list = new ArrayList<>();
    
        int i = 0;

        while (i < n) {
            int c = arr[i] - 1;
            if ( arr[i] != arr[c])
            {
                swap(arr, i, c);
            }

            else
                i++;
        }
        for (i = 0; i < n; i++)
        {
            if (arr[i] != i + 1)
                list.add(arr[i]);
        }
        return list;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    
    }
}