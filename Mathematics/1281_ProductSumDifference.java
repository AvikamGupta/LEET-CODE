import java.util.*;
class Solution {
     public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int m=Math.abs(n);
        while (m>0) 
        {
            int r=m%10;
            sum+=r;
            product*=r;
            m/=10;
        }
        return (product-sum);
    }
        public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
       System.out.println("enter the number");
       int n1=av.nextInt();
       System.out.println(ob.subtractProductAndSum(n1));
    }
}
