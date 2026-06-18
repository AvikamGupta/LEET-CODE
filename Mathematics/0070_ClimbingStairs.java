import java.util.*;
class Solution {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        int stage1=2;
        int stage2=1;
      for (int index = 3; index <= n; index++) {  /*ways(1) = 1        → {1}
                                                    ways(2) = 2        → {1,1}, {2}
                                                    ways(3) = 2 + 1 = 3  → {1,1,1}, {1,2}, {2,1}
                                                    ways(4) = 3 + 2 = 5
                                                   ways(5) = 5 + 3 = 8*/
        int posn=stage1+stage2;
        stage2=stage1;
        stage1=posn;
      }
    return stage1;}
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("Enter the number");
        int n1 = av.nextInt();
        System.out.println(ob.climbStairs(n1));
    }
}
