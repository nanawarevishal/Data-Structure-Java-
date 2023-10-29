

/*

5) Largest subarray with 0 sum
        Given an array having both positive and negative integers. The task is to
        compute the length of the largest subarray with sum 0.

        Example 1:
        Input:
        N = 8
        A[] = {15,-2,2,-8,1,7,10,23}
        Output: 5

        Explanation: The largest subarray with
        sum 0 will be -2 2 -8 1 7.
        Expected Time Complexity: O(N).
        Expected Auxiliary Space: O(N).
        Constraints:
        1 <= N <= 105
        -1000 <= A[i] <= 1000, for each valid i.


 */



package Assignment.SubArray;

import java.util.HashMap;

class SubArraySumZeor{

    static int largeSubArrayZeroSum(int[] nums){

        HashMap<Integer,Integer>hm = new HashMap<>();

        int sum = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){

            sum +=nums[i];

            if(sum==0){
                maxLen = i+1;
            }

            else if(hm.containsKey(sum)){
                maxLen = Math.max(maxLen, i-hm.get(sum));

            }

            else{
                hm.put(sum, i);
            }


        }

        return maxLen;


    }

    public static void main(String[] args) {

        int A[] = {15,-2,2,-8,1,7,10,23};
        System.out.println(largeSubArrayZeroSum(A));
    }
}