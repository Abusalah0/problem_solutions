class Solution {
    public:
        bool isValid(string s)
    {
    
        stack<char> stack1;
        for (char c : s)
        {
            if (stack1.empty()) {
                stack1.push(c);
                continue;
            }
    
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack1.push(c);
                    break;
                case ')':   
                case ']':
                case '}':
                   if (c - 1 == stack1.top() || c - 2 == stack1.top()){
                        stack1.pop();
                        break;
                   }
                   else 
                    return false;
    
            }
        }
        if (stack1.empty())
            return true;
        else
            return false;
    }
    
    };