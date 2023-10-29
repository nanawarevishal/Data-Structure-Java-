package SubArray;

class SubArraySumPrefix{

    static void subArraySumPrefix(int[] nums){
        
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        for(int i=1;i<nums.length;i++){
            prefixSum[i] = nums[i]+prefixSum[i-1];
        }


        for(int i=0;i<nums.length;i++){

            for(int j=i;j<nums.length;j++){
                if(i!=0){
                    System.out.println(prefixSum[j]-prefixSum[i-1]);
                }
                else{
                    System.out.println(prefixSum[j]);
                }
            }
        }


    }

     public static void main(String[] args) {
        
        int[] nums = {2,4,1,3};

        subArraySumPrefix(nums);
    }
}