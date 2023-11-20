package Two_D_Matrix;

class TransposeMatrix{

    static void transposeMatrix(int[][] nums){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums[i].length;j++){
               int temp = nums[i][j];
               nums[i][j]= nums[j][i];
               nums[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        
        int nums[][] = {{1,2,3,4},
                        {7,8,9,10,},
                        {13,14,15,16},
                        {19,20,21,22}};
        
        transposeMatrix(nums);

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
               System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}