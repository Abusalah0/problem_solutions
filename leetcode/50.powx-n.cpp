class Solution {
    public:
        double fastpow(double a, int b)
        {
                if (b == 1) return a;
                if (b == 0) return 1;
    
                double temp = fastpow(a, b / 2);
    
                double res = temp * temp ;
    
                if (b % 2 != 0)
                 res *= a;
    
                return res;
        }
        double myPow(double x, int n) {
           
            if (n < 0)
              x = 1 / x;
        
            n = abs (n);
    
            return fastpow(x,n);
    
        }
    };