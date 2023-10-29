
/*
 7) Reverse sub array
        Provided an array Arr of N integers, you need to reverse a subarray of that
        array. The range of this subarray is given by L and R.

        Example 1:
        Input:
        N = 7
        Arr[] = {1, 2, 3, 4, 5, 6, 7}
        L = 2, R = 4
        Output:
        1 4 3 2 5 6 7
        Explanation: After reversing the elements
        in range 2 to 4 (2, 3, 4),
        the modified array is 1, 4, 3, 2, 5, 6, 7.

        Example 2:
        Input:
        N = 4
        Arr[] = {1, 6, 7, 4}
        L = 1, R = 4
        Output:
        4 7 6 1
        Explanation: After reversing the elements
        in range 1 to 4 (1, 6, 7, 4),
        The modified array is 4, 7, 6, 1.

        Expected Time Complexity: O(N)
        Expected Auxiliary Space: O(1)


        Constraints:
        1 ≤ N ≤ 10^7
        1 ≤ Arr[i] ≤ 10^6
        1 ≤ L ≤ R ≤ N
 */


package Assignment.SubArray;

class ReversseSubArray{

    static int[] reverseSubArray(int[] nums,int start,int end){

        int left = start-1;
        int right = end;

        while(left <right){
            int temp = nums[left];
            nums[left] = nums [right];
            nums[right] = temp;
            left++;
            right--;
        }

        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int ans[] = reverseSubArray(nums, 2, 4);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

        System.out.println();
    }
}