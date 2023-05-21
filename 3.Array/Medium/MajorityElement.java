
/*
 169. Majority Element
        Easy
        14.7K
        446
        Companies
        Given an array nums of size n, return the majority element.

        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

        

        Example 1:

        Input: nums = [3,2,3]
        Output: 3
        Example 2:

        Input: nums = [2,2,1,1,1,2,2]
        Output: 2

 */



package Medium;

import java.util.HashMap;
import java.util.Map;

import Easy.removeDuplicate;

public class MajorityElement {

    static int bruteForce(int[] nums) {
        
        int max = 0;
        int id = 0;
        for(int i=0;i<nums.length;i++){
            int cnt=1;

            for(int j=i+1;j<nums.length;j++){

                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt > max){
                max = cnt;
                id = i;

            }
        }

        return nums[id];
    }

    static int betterSol(int[] nums){

        HashMap<Integer,Integer>hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int val = hm.getOrDefault(nums[i], 0);
            hm.put(nums[i], val+1);
        }

        for (Map.Entry<Integer, Integer> it : hm.entrySet()) {
            if (it.getValue() > (nums.length / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }

    static int optimalSol(int[] nums){

        int ele = nums[0];
        int count=0;

        for(int i=0;i<nums.length;i++){

            if(count==0){
                count=1;
                ele = nums[i];
            }
            else if(nums[i]==ele){
                count++;
            }

            else{
                count--;
            }
        }
        int cnt=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                cnt++;
            }
        }

        if(cnt>nums.length/2){
            return ele;
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int num[] = {3,2,3};

        System.out.println(betterSol(num));
    }
    
}
