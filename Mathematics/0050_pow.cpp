class Solution {
public:
    double myPow(double x, int n) {
        long binfm = n;
        double ans = 1.0;          

        if (n == 0) return 1.0;
        if (x == 0) return 0.0;
        if (x == 1) return 1.0;
        if (x == -1 && n % 2 == 0) return 1.0;   
        if (x == -1 && n % 2 != 0) return -1.0;  

        if (n < 0) {
            x = 1 / x;
            binfm = -binfm;
        }

        while (binfm > 0) {
            if (binfm % 2 == 1)
                ans *= x;
            x *= x;
            binfm /= 2;
        }
        return ans;
    }
};
