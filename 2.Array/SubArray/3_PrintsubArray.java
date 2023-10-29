package SubArray;

import java.util.ArrayList;

class SubArrayPrint{

    static void printSubArray(int[] nums){

        for(int i=0;i<nums.length;i++){

            ArrayList<Integer>ls = new ArrayList<>();
            for(int j=i;j<nums.length;j++){
                ls.add(nums[j]);
                System.out.println(ls);
            }
        }
    }

    public static void main(String[] args) {
        
        int[] nums = {2,4,1,3};

        printSubArray(nums);
    }
}
