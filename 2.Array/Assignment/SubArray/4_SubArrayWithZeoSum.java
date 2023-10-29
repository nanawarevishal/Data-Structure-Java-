

/*
4) Subarray with 0 sum
        Given an array of positive and negative numbers. Find if there is a subarray
        (of size at-least one) with 0 sum.
        Example 1:
        Input:
        5
        4 2 -3 1 6
        Output:
        Yes
        Explanation:
        2, -3, 1 is the subarray
        with sum 0.
        Example 2:
        Input:
        5
        4 2 0 1 6
        Output:
        Yes
        Explanation:
        0 is one of the element
        in the array so there exist a
        subarray with sum 0.

        Expected Time Complexity: O(n).
        Expected Auxiliary Space: O(n).
        Constraints:
        1 <= n <= 10^4
        -10^5 <= a[i] <= 10^5


 */


package Assignment.SubArray;

import java.util.HashSet;

class SubArrayZeroSum{

    static boolean zeroSum(int[] nums){

        HashSet<Integer>hs = new HashSet<>();
        int sum = 0;

        for(int i=0;i<nums.length;i++){

            sum += nums[i];

            if(nums[i]==0 || hs.contains(sum) || sum==0){
                return true;
            }

            hs.add(sum);

        }

        return false;

    }

    public static void main(String[] args) {
        
        int []arr = {4, 2, -3, 1 ,6};

        System.out.println(zeroSum(arr));
    }
}
