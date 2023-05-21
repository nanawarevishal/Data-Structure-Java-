package Medium;

public class maximumSubArraySum {
    static int optimalSol(int[] nums){

        int max = Integer.MIN_VALUE;
        int sum=0;
        int start =0,astart=-1,aend=-1;

        for(int i=0;i<nums.length;i++){

            if(sum==0){
                start= i;
            }
            sum +=nums[i];

            if(sum>max){
                max = sum;
                astart = start;
                aend = i;
            }

            if(sum<0){
                sum=0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums ={5,4,-1,7,8};

        System.out.println(optimalSol(nums));

    }
}
