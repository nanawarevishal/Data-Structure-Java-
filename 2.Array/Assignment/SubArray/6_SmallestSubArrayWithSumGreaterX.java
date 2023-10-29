package Assignment.SubArray;


/*
6) Smallest subarray with sum greater than x
        Given an array of integers (A[]) and a number x, find the smallest subarray
        with sum greater than the given value. If such a subarray does not exist,
        return 0 in that case.

        Example 1:
        Input:
        A[] = {1, 4, 45, 6, 0, 19}
        x = 51
        Output: 3
        Explanation:
        Minimum length subarray is
        {4, 45, 6}

        Example 2:
        Input:
        A[] = {1, 10, 5, 2, 7}
        x = 9
        Output: 1
        Explanation:
        Minimum length subarray is {10}


        Expected Time Complexity: O(N)
        Expected Auxiliary Space: O(1)

        Constraints:
        1 ≤ N, x ≤ 10^5
        0 ≤ A[] ≤ 10^4


 */


class SubArraySumX{

    static int subArraySumGreaterX(int[] nums,int k){

        int start = 0;
        int end = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while(end<nums.length){

            if(sum>=k){
                minLen = Math.min(minLen,end-start+1);
                end++;
            }

            if(sum>k){
                sum -= nums[start];
                start++;
            }

            else if(sum<k){
                sum +=nums[end];
                end++;
            }
        }

        return minLen;

    }

    public static void main(String[] args) {
        
        int[] arr = {1, 10, 5, 2, 7};
        int k = 9;

        System.out.println(subArraySumGreaterX(arr, k));
    }
}