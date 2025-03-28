class Solution {
    public:
        int maxDepth(string s) {
             stack<char> buffer;
        int max = 0;
        if (s.size() == 0)
        {
            return 0;
        }
        else{
            for (int i = 0; i < s.size(); ++i) {
                if (s[i] == '(')
                {
                    buffer.push('(');
                }
                else if (s[i] == ')')
                {
                    buffer.pop();
                }
                max = (max < buffer.size()) ? buffer.size() : max;
            }
        }
        return max;
        }
    };