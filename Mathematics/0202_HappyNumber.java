import java.util.*;
class Solution {
        public boolean isHappy(int n) {
        while (n!=1 && n!=4) {//Every unhappy number eventually reaches 4 and loops forever:
            int sum=0;
            while (n>0)
                 {
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
            }
            n=sum;
        }
       if (n==1) 
          {
          return true;      
         } 
         else {
           return false;
              }
            }
        public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob=new Solution();      
        System.out.println("enter the number");
        int num=av.nextInt();
        if(ob.isHappy(num))
        {
            System.out.println("THE NUMBER IS HAPPY");
        }
        else
        {
            System.out.println("number is unhappy");
        }
    }
}
