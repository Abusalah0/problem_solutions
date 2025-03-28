class Solution {
    public:
        int largestRectangleArea(vector<int>& height) {
            int maxArea = 0;
            std::stack<std::pair<int, int>> stack;
    
            for (int i = 0; i < height.size(); ++i) {
                int start = i;
                while (!stack.empty() && stack.top().second > height[i]) {
                    auto [index, h] = stack.top();
                    stack.pop();
    
                    maxArea = std::max(maxArea, h * (i - index));
                    start = index;
                }
                stack.push({start, height[i]});
            }
    
            while (!stack.empty()) {
                auto [index, h] = stack.top();
                stack.pop();
                maxArea = std::max(maxArea, h * (static_cast<int>(height.size()) -index));
            }
    
            return maxArea;
        }
        
    };