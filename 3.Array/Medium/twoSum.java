package Medium;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

    static int[] bruteforce(int[] nums,int target){

        int left=0;
        int right = nums.length-1;
        Arrays.sort(nums);

        int sol[] = new int[2];

        while(left<right){

            if(nums[left]+nums[right]==target){
                sol[0] = nums[left];
                sol[1] = nums[right];
                return sol;
            }

            if(nums[left]+nums[right]>target){
                right--;
            }

            else{
                left++;
            }
            
        }

        return sol;
    }


    static int[] Optimal(int[] nums,int target){
        int[] sol = new int[2];

        HashMap<Integer,Integer>hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int need = target-nums[i];

            if(hm.containsKey(need)){
                sol[0] = hm.get(need);
                sol[1] = i;
                return sol;
            }

            hm.put(nums[i],i);

        }
        return sol;
        
    }
    public static void main(String[] args) {

        int[] nums  = {2,6,5,8,11};
        int target = 14;

        // int[] a = bruteforce(nums, target);
        int[] a = bruteforce(nums, target);

        System.out.println(a[0]+" "+a[1]);
    }
}
