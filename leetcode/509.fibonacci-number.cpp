class Solution {
    public:
        int fib(int n) {
           
           if (n == 0)
            return 0;
    
            int t1 = 1, t2 = 1;
            for(int current = 0, i = 3; i <= n; i+=1)
            {
                current = t1 + t2;
                t1 = t2;
                t2 = current;
            }
            return t2;
        }
    };