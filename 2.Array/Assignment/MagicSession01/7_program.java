

/*

Problem 7
        Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the
        product of the maximum product subarray.
        Example 1:
        Input:
        N = 5
        Arr[] = {6, -3, -10, 0, 2}
        Output: 180
        Explanation: Subarray with maximum product
        is [6, -3, -10] which gives the product as 180.
        Example 2:
        Input:
        N = 6
        Arr[] = {2, 3, 4, 5, -1, 0}
        Output: 120
        Explanation: Subarray with maximum product
        is [2, 3, 4, 5] which gives the product as 120.

 */


package Assignment.MagicSession01;

class MaxProd{

    static int maxProduct(int[] arr){

        int maxProd = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int prod = 1;
            for(int j=i;j<arr.length;j++){
                prod *= arr[j];

                maxProd = Math.max(maxProd,prod);
            }
        }

        return maxProd;
    }

    public static void main(String[] args) {

        int Arr[] = {2, 3, 4, 5, -1, 0};

        System.out.println(maxProduct(Arr));
    }

}