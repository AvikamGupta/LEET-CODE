import java.util.*;
public class Solution {
     String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;                                     
            result.append((char) ('A' + columnNumber % 26));    
            columnNumber /= 26;                                  
        }
        return result.reverse().toString();                    
    }
        public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob= new Solution();
       System.out.println("enter the column number");
       int n1 = av.nextInt();
       System.out.println(ob.convertToTitle(n1));
    }
}
