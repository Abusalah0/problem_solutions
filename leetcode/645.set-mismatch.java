class Solution {
    public int[] findErrorNums(int[] arr) {
        int n = arr.length;
        int[] list = new int[2];
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
            if (arr[i] != i + 1){
               list[1] = i+ 1;
               list[0] = arr[i];
            }
        }
        return list;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    
    }
}