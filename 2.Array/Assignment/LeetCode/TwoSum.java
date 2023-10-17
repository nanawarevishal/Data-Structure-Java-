

/*

2. Two Sum (Leetcode:- 1)

        Given an array of integer numbers and an integer target, return indices of
        the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you
        may not use the same element twice.
        You can return the answer in any order.

        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]

        Constraints:
        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.

 */

package Assignment.LeetCode;

import java.util.*;

public class TwoSum {

    static ArrayList<Integer> twoSum(int[] arr,int target){
        ArrayList<Integer>ls = new ArrayList<>();

        HashMap<Integer,Integer>hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(hm.containsKey(target-arr[i])){
                ls.add(hm.get(target-arr[i]));
                ls.add(i);
            }

            hm.put(arr[i],i);
        }

        return ls;
    }

    
    public static void main(String[] args) {
        int []nums = {3,2,4};
        int target = 6;

        System.out.println(twoSum(nums, target));
    }
}
