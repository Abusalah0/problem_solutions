class Solution {
    public boolean binSearch(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;
        int row = 0;
        while (left <= right)
        {
            row = (left + right) / 2;
            if (target == arr[row])
                return true;
            if (target > arr[row])
                left = row + 1;
            else if (target < arr[row])
                right = row - 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        while (i < rows)
        {
            if (target < matrix[i][0])
                return (false);
            if (binSearch(matrix[i], target))
                return true;
            i++;
        }
        return false;
    }
}