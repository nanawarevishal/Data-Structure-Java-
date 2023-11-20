package SubArray;


class SubMaxSum{

    static int maxSumSubArrayBruteForce(int[] nums){

        int maxSum = 0;
        for(int i=0;i<nums.length;i++){

            int sum = 0;
            for(int j=i;j<nums.length;j++){

                sum +=nums[j];

                if(maxSum<sum){
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    static int maxSumSubArrayOptimal(int[] nums){

        int sum = 0;
        int maxSum = 0;
        for(int i=0;i<nums.length;i++){

            sum += nums[i];
            
            if(sum >maxSum){
                maxSum = sum;
            }

            if(sum<0){
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
        int []nums = {-21,-34,-121,-54};

        System.out.println(maxSumSubArrayOptimal(nums));
    }
}


/*

Time Complexity:
                Brute Force : O(N*N)
                Optimal     : O(N)

 */