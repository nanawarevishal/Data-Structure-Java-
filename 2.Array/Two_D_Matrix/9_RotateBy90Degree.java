package Two_D_Matrix;

class RotateArray{

    static void rotateArray(int [][]nums){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }

        for(int i=0;i<nums.length;i++){

            int left = 0;
            int right = nums.length-1;

            while(left<right){
                int temp = nums[i][left];
                nums[i][left] = nums[i][right];
                nums[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        
        int [][] nums = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}};

        rotateArray(nums);

        for(int i=0;i<nums.length;i++){

            for(int j=0;j<nums.length;j++){
                System.out.print(nums[i][j]+" ");
            }

            System.out.println();
        }
    }
}
