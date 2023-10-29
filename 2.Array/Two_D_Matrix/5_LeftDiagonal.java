package Two_D_Matrix;


class leftDiagonal{
    
    static void printLeftDiagonal(int[][] nums){

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i][i]);
        }
    }

    public static void main(String[] args) {
        int nums[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        printLeftDiagonal(nums);
    }
}
