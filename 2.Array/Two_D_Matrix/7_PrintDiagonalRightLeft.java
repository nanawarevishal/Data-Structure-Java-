package Two_D_Matrix;


class RLDiagonal{

    static void rightleftDiagonal(int[][] nums){

        for(int i=nums[0].length-1;i>=0;i--){

            int k = i;
            int j = 0;
            while(j<nums.length && k>=0){
                System.out.print(nums[j][k]+" ");
                j++;
                k--;

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int nums[][] = {{1,2,3,4,5,6},
                        {7,8,9,10,11,12},
                        {13,14,15,16,17,18},
                        {19,20,21,22,23,24}};
        rightleftDiagonal(nums);

    }
}
