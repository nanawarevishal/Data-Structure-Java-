package SubArray;


class TotalSumAubArray{

    static int totalSumSubArray(int[] nums){

        int totalSum = 0;
        for(int i=0;i<nums.length;i++){

            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum +=nums[j];
                totalSum +=sum;
            }
        }

        return totalSum;
    }


    public static void main(String[] args) {
        int nums[] = {1,2,3};

        System.out.println(totalSumSubArray(nums));
    }
}
