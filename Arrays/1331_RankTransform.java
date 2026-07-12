import java.util.*;
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int clean[] = arr.clone(); // using clone function to copy
        Arrays.sort(clean);
        HashMap<Integer,Integer> ranking = new HashMap<>();
        int rank = 1;
        for (int i : clean) { // using for each
            if (!ranking.containsKey(i)) // if element did not have a rank
            {
                ranking.put(i, rank); // assign it the current rank
                rank++; // update rank for the next new value
            }
        }
        int result[] = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = ranking.get(arr[i]); // look up rank of the actual value
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        Solution ob = new Solution();
        System.out.println("enter NUMBER of array elements");
        int n = av.nextInt();
        int ar2[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = av.nextInt();
        }
        int result[] = ob.arrayRankTransform(ar2);
        System.out.println(Arrays.toString(result));
    }
}
