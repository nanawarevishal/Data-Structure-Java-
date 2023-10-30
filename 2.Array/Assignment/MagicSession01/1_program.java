


/*

Problem 1:
        Given an array containing n integers. The problem is to find the sum of the
        elements of the contiguous subarray having the smallest(minimum) sum.
        Examples:
        Input : arr[] = {3, -4, 2, -3, -1, 7, -5}
        Output : -6
        Subarray is {-4, 2, -3, -1} = -6
        Input : arr = {2, 6, 8, 1, 4}
        Output : 1
    

 */



package Assignment.MagicSession01;


class MinSumSubArray{

    static int minSumSubArrayBruteForce(int[] arr){
        
        int minSum = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            
            int sum = 0;
            for(int j=i;j<arr.length;j++){

                sum +=arr[j];

                minSum = Math.min(minSum, sum);
            }
        }

        return minSum;
    }

    static int minSumSubArrayOptimal(int[] arr){
        int minSum = Integer.MAX_VALUE;

        int sum = 0;

        for(int i=0;i<arr.length;i++){

            sum += arr[i];

            if(sum<minSum){
                minSum = sum;
            }

            if(sum>minSum){
                sum = 0;
            }
        }



        return minSum;
    }

    public static void main(String[] args) {

        int arr[] = {3, -4, 2, -3, -1, 7, -5};

        System.out.println(minSumSubArrayBruteForce(arr));

    }
}