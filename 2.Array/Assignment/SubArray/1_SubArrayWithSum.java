

/*

 1) Subarray with given sum
        Given an unsorted array A of size N that contains only positive integers, find
        a continuous sub-array that adds to a given number S and return the left and
        right index(1-based indexing) of that subarray.
        In case of multiple subarrays, return the subarray indexes which come first
        on moving from left to right.
        Note:- You have to return an ArrayList consisting of two elements left and
        right. In case no such subarray exists, return an array consisting of element
        -1.

        Example 1:
            Input:
            N = 5, S = 12
            A[] = {1,2,3,7,5}
            Output: 2 4
            Explanation: The sum of elements
            from 2nd position to 4th position
            is 12.

        Example 2:
            Input:
            N = 10, S = 15
            A[] = {1,2,3,4,5,6,7,8,9,10}
            Output: 1 5
            Explanation: The sum of elements
            from 1st position to 5th position
            is 15.

        Expected Time Complexity: O(N)
        Expected Auxiliary Space: O(1)
        Constraints:
        1 <= N <= 10^5
        0 <= Ai <= 10^9
        0<= S <= 10^9
 */



package Assignment.SubArray;

import java.util.ArrayList;

class SubArraySumK{

    static ArrayList<Integer> subarraySumK(int[] nums,int k){

        ArrayList<Integer>ls = new ArrayList<>();

        int start = 0;
        int end = 0;
        int sum = 0;
        while(end<nums.length && start<=end){

            if(sum>k){
                sum -=nums[start];
                start++;
            }
            
            if(sum==k){
                ls.add(start+1);
                ls.add(end);
                break;
            }
            
            if(sum<k){
                sum +=nums[end];
                end++;
            }
        }

        return ls;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};

        ArrayList<Integer>ls = subarraySumK(arr, 12);
        System.out.println(ls);


    }
}