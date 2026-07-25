import java.util.*;
class Solution {
    public int maxProduct(int n) {
         int one=0;
        int second=0;
        while (n>0) {
            int a=n%10;
            if (a>one) {
                second=one;
                one=a;
            }
            else if (a>second) {
                second=a;
            }
            n/=10;
        }
    return one*second;
}
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("enter a number");
        int a = av.nextInt();
        System.out.println(ob.maxProduct(a));
    }
}
