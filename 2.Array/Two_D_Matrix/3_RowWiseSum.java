package Two_D_Matrix;

class RowWiseSum{
     static void rowWiseSum(int[][] nums){

        for(int i=0;i<nums.length;i++){
            int sum = 0;

            for(int j=0;j<nums[i].length;j++){
                
                sum +=nums[i][j];
            }
            System.out.println(sum+" ");
        }
    }

    public static void main(String[] args) {
        
        int[][] nums = new int[][]{{1,2,3,4},
                                    {5,6,7,8},
                                    {9,10,11,12}};
        rowWiseSum(nums);
    }
}
