

class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; ++i) {
            int asteroid = arr[i];
            boolean destroyed = false;
            
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                int top = stack.peek();
                if (top < -asteroid) {
                    stack.pop();
                    continue;
                } else if (top == -asteroid) {
                    stack.pop();
                }
                destroyed = true;
                break;
            }
            
            if (!destroyed) {
                stack.push(asteroid);
            }
        }
        
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; --i) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}
