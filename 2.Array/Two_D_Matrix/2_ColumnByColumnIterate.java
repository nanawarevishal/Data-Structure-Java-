package Two_D_Matrix;

class IterateColumnByColumn{

    static void columnByColumnIterate(int[][] nums){

        for(int i=0;i<nums[0].length;i++){
            for(int j=0;j<nums.length;j++){
                System.out.print(nums[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,2,3,4},
                                    {5,6,7,8},
                                    {9,10,11,12}};
        columnByColumnIterate(nums);
    }
}