class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] out = new int[n];
        Stack<Integer> s = new Stack<>();
        
        for (int j = 0; j < n; ++j) {
            while (!s.isEmpty() && arr[j] > arr[s.peek()]) {
                int i = s.pop();
                out[i] = j - i;
            }
            s.push(j);
        }
        
        return out;
    }
}
