package EquilibriumIndex;

class EquilibriumIndex{

    static int equlibriumIndexBruteForce(int nums[]){

        for(int i=0;i<nums.length;i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int j=i+1;j<nums.length;j++){
                rightSum +=nums[j];
            }

            for(int k = i-1;k>=0;k--){
                leftSum +=nums[k];
            }

            if(leftSum == rightSum){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int nums[] = {-7,1,5,2,-4,3,0};

        System.out.println(equlibriumIndexBruteForce(nums));
    }
}