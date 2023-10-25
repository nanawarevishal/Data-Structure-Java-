package SubArray;

import java.util.HashMap;

class MinimumSubArray{

    static int minimumSubArrayBruteForce(int[] nums){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min,nums[i]);
        }

        int len = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){

                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==min){
                        len = Math.min(len,j-i+1);
                    }
                }
            }

            else if(nums[i]==min){

                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==max){
                        len = Math.min(len, j-i+1);
                    }
                }
            }
        }

        return len;
    }

    static int minimumSubArrayWithMinMax(int nums[]){

        HashMap<Integer,Integer>hm = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min,nums[i]);
        }

        int minInd = -1;
        int maxInd = -1;
        int len = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==min){
                minInd = i;
            }

            else if(nums[i]==max){
                maxInd = i;
            }

            if(minInd !=-1 && maxInd!=-1){
                len = Math.min(len,Math.abs(minInd-maxInd)+1);
            }
        }

        return len;
    }

    public static void main(String[] args) {
        
        int nums[] = {1,2,3,1,3,4,6,4,6,3};

        System.out.println(minimumSubArrayWithMinMax(nums));
    }
}