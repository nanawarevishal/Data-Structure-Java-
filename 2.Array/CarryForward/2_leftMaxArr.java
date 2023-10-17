package CarryForward;

class LeftMaxarr{

    static int[] leftMaxBruteForce(int[] arr){
        int nums[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
        
            int max = Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){

                max = Math.max(max, arr[j]);
            }

            nums[i] = max;
        }

        return nums;
    }

    static int[] leftMaxArrOptimal(int[] arr){
        int nums[] = new int[arr.length];

        // int max = Integer.MIN_VALUE;

        // for(int i=0;i<arr.length;i++){

        //     if(max<arr[i]){
        //         max = arr[i];
        //     }



        //     nums[i] = max;
        // }


        nums[0] = arr[0];
        
        for(int i=1;i<arr.length;i++){
            
            if(nums[i-1]>arr[i]){
                nums[i] = nums[i-1];
            }

            else{
                nums[i] = arr[i];
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        
        int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

        int nums[] = leftMaxArrOptimal(arr);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}



/*
 * Time Complexity:
 *              Brute Force : O(N*N)
 *              Optimal     :     O(N)
 * 
 * 
 * Space Complexity:
 *                  O(N)
 *              
 */