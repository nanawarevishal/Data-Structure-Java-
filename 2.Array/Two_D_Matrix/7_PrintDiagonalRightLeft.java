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

    static void leftRightDiagonals(int[][] nums){

        for(int i=0;i<nums[0].length;i++){

            int k = 0;
            int j = i;

            while(k<nums.length && j>=0){
                System.out.print(nums[k][j]+" ");
                k++;
                j--;
            }

            System.out.println();
        }

        for(int i=1;i<nums.length;i++){

            int k = i;
            int j = nums[0].length-1;

            while(k<nums.length && j>=0){
                System.out.print(nums[k][j]+" ");
                k++;
                j--;


            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int nums[][] = {{1,2,3,4,5,6},
                        {7,8,9,10,11,12},
                        {13,14,15,16,17,18},
                        {19,20,21,22,23,24},
                        {25,26,27,28,29,30}};

        rightleftDiagonal(nums);

        System.out.println();

        leftRightDiagonals(nums);

    }
}
