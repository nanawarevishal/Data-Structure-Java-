

/*
 10) Find Maximum Sum Strictly Increasing Subarray
        Given an array of positive integers. Find the maximum sum of strictly
        increasing subarrays.

        Example 1:
        Input :
        arr[] = {1, 2, 3, 2, 5, 1, 7}
        Output :
        8
        Explanation :
        Some Strictly increasing subarrays are -
        {1, 2, 3} sum = 6,
        {2, 5} sum = 7,
        {1, 7} sum = 8,
        maximum sum = 8

        Example 2:
        Input:
        arr[] = {1, 2, 2, 4}
        Output:
        6

        Expected Time Complexity: O(N)
        Expected Auxiliary Space: O(1)
        Constraints:
        1 ≤ N ≤ 10^5
        1 ≤ A[i] ≤ 1000


 */



package Assignment.SubArray;

class MaxSum{

    static int maxSumSybArray(int[] nums){

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length-1;i++){

            if(nums[i]<nums[i+1]){
                sum +=nums[i];
            }

            else if(nums[i]>=nums[i+1]){
                sum +=nums[i];
                maxSum = Math.max(maxSum,sum);
                sum = 0;
            }
        }

        if(nums[nums.length-2]<nums[nums.length-1]){
            sum +=nums[nums.length-1];
            maxSum = Math.max(maxSum, sum);

        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4};

        System.out.println(maxSumSybArray(arr));
    }
}