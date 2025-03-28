class Solution {
    public:
        string removeStars(string s) {
    
        stack<char> word;
        string result ;
    
        for (char c : s)
        {
            if (c == '*')
            {
                word.pop();
            }
            else
            {
                word.push(c);
            }
    
        }
    
        while(!word.empty())
        {
            result += word.top();
            word.pop();
        }
        reverse(result.begin(), result.end()) ;
    
     return result;
    
    
        }
    
    };