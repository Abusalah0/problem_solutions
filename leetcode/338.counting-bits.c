/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* countBits(int n, int* returnSize) {
    int *arr = malloc(sizeof(int) * (n + 1));
    if (!arr) 
    {
        *returnSize = 0;
        return (NULL);
    }
    *returnSize = n + 1;
    arr[0] = 0;
    int offset = 1;
    for (int i = 1; i <= n; i++)
    {
        if (offset * 2 == i)
            offset = i;
        arr[i] = 1 + arr[i - offset];
    }
    return arr;
}