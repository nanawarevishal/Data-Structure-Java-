
/*

8) Maximum Product Subarray
        Given an array Arr[] that contains N integers (may be positive, negative or
        zero). Find the product of the maximum product subarray.

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

        Note: Use 64-bit integer data type to avoid overflow.
        Expected Time Complexity: O(N)
        Expected Auxiliary Space: O(1)

        Constraints:
        1 ≤ N ≤ 500
        -10^2 ≤ Arri ≤ 10^2

 */



package Assignment.SubArray;

class MaxProductSubArray{

    static long maxProduct(int[] arr, int n) {

        long maxPro = Long.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            long product = 1;
            for (int j = i; j < n; j++) {
                product = product*arr[j];

                if (product > maxPro) {
                    maxPro = product;
                }
            }
        }

        return maxPro;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {6, -3, -10, 0, 2};

        System.out.println("Max Product " + maxProduct(arr1,arr1.length));
    }

}