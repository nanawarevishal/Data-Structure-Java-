
/*
 53. Maximum Subarray
            Medium
            29.6K
            1.3K
            Companies
            Given an integer array nums, find the 
            subarray
            with the largest sum, and return its sum.

            

            Example 1:
            Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
            Output: 6
            Explanation: The subarray [4,-1,2,1] has the largest sum 6.

            Example 2:

            Input: nums = [1]
            Output: 1
            Explanation: The subarray [1] has the largest sum 1.
            Example 3:

            Input: nums = [5,4,-1,7,8]
            Output: 23
            Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */



package Medium;

public class maximumSubArray {
    static int bruteForce(int[] nums) {

        int maxi = Integer.MIN_VALUE; 

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;
        
    }

    static int betterSol(int[] nums){
        int maxi = Integer.MIN_VALUE; 

        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j < nums.length; j++) {

                sum += nums[j];
                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;
        
    }

    static int optimalSol(int[] nums){

        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){

            sum +=nums[i];

            if(sum>max){
                max = sum;
            }

            if(sum<0){
                sum=0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums ={5,4,-1,7,8};

        System.out.println(bruteForce(nums));
    }
}
