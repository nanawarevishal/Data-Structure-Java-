
/*
 * 
 * Query    s     e     sum
 * 1        1     3      12
 * 2        2     7      12
 * 3        1     1      6
 * 
 */

package PrefixSum;

import java.util.HashMap;

class RangeSum2{

    static int rangeSum(int[] arr){

        HashMap<Integer,Integer>hm = new HashMap<>();

        int sum = 0;
        for(int i=0;i<arr.length;i++){

            sum +=arr[i];
            hm.put(i,sum);
        }

        //  Query 1

        int sum1 = hm.get(3)-hm.get(1)+arr[1];
        System.out.println(sum1);

        // Query 2

        int sum2 = hm.get(7)-hm.get(2)+arr[2];
        System.out.println(sum2);

        // Query 3
        int sum3 = hm.get(1)-hm.get(0);
        System.out.println(sum3);

        return 0;
    }

    public static void main(String[] args) {
        
        int[] arr= {-3,6,2,4,5,2,8,-9,3,1};

        System.out.println(rangeSum(arr));
    }
}



/*
 * Time Complexity:
 *                  BruteForce : O(Q*N)
 *                  Optimal    : O(N)
 *                  
 */
