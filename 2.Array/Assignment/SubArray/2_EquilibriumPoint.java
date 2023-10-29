

/*
 2) Equal Left and Right Subarray Sum
        Given an array A of n positive numbers. The task is to find the first index in
        the array such that the sum of elements before it is equal to the sum of
        elements after it.
        Note: Array is 1-based indexed.

        Example 1:
        Input:
        n = 5
        A[] = {1,3,5,2,2}
        Output: 3
        Explanation: For second test case
        at position 3 elements before it
        (1+3) = elements after it (2+2).

        Example 2:
        Input:
        n = 1
        A[] = {1}
        Output: 1
        Explanation:
        Since its the only element hence
        it is the only point.

        Expected Time Complexity: O(N)
        Expected Space Complexity: O(1)
        Constraints:
        1 <= n <= 10^6
        1 <= A[i] <= 10^8
 */



package Assignment.SubArray;

class EquilibriumPoint{

    static int equilibriumPoint(int[] nums){

        int PrefixSum[] = new int[nums.length];
        int suffixSum[] = new int[nums.length];

        PrefixSum[0] = 0;
        suffixSum[nums.length-1] = 0;

        for(int i=1;i<nums.length;i++){
            PrefixSum[i] = nums[i-1]+PrefixSum[i-1];
            suffixSum[nums.length-i-1] = nums[nums.length-i]+suffixSum[nums.length-i]; 
        }

        for(int i=0;i<nums.length;i++){
            if(suffixSum[i]==PrefixSum[i]){
                return i+1;
            }
        }

        return -1;  
    }

    public static void main(String[] args) {

        int  A[] = {1,3,5,2,2};

        System.out.println(equilibriumPoint(A));
    }
}
