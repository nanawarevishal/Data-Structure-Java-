package SubArray;


class SubArraySum{

    static void subArraySum(int[] nums){
         for(int i=0;i<nums.length;i++){

            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum +=nums[j];
                System.out.println(sum);
            }
        }
    }

    public static void main(String[] args) {
        
        int[] nums = {2,4,1,3};

        subArraySum(nums);
    }
}
