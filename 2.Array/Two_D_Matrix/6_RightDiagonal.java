package Two_D_Matrix;

class RightDiagonal{

    static void leftDiagonal(int[][] nums){

        int i = 0;
        int j = nums.length-1;

        while(i<nums.length && j>=0){
            System.out.println(nums[i][j]);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {

        int nums[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        
        leftDiagonal(nums);
    }   
}
