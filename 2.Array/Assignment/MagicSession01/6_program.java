
/*

Problem 6
        Given an array A of n positive numbers. The task is to find the first equilibrium point in an array.
        Equilibrium point in an array is an index (or position) such that the sum of all elements before
        that index is the same as the sum of elements after it.
        Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.

        Example 1:
        Input:
        n = 5
        A[] = {1,3,5,2,2}
        Output:
        3
        Explanation:
        equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it
        (2+2).

        Example 2:
        Input:
        n = 1
        A[] = {1}
        Output:
        1
        Explanation:
        Since there's only one element hence it's only the equilibrium point.

        Your Task:
        The task is to complete the function equilibriumPoint() which takes the array and n as input
        parameters and returns the point of equilibrium.
        Expected Time Complexity: O(n)
        Expected Auxiliary Space: O(1).

        Constraints:
        1 <= n <= 105
        1 <= A[i] <= 109

 */



package Assignment.MagicSession01;

class EqulibriumIndex{

    static int equilibriumIndex(int []arr){

        int prefixSum[] = new int[arr.length];
        int suffixSum[] = new int[arr.length];

        prefixSum[0] = 0;
        suffixSum[suffixSum.length-1] = 0;

        for(int i=1;i<arr.length;i++){
            prefixSum[i] = prefixSum[i-1]+arr[i-1];
            suffixSum[arr.length-1-i] = suffixSum[arr.length-i]+arr[arr.length-i];
        }

        for(int i=0;i<arr.length;i++){

            if(prefixSum[i]==suffixSum[i]){
                return i;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};

        System.out.println(equilibriumIndex(arr));
    }
}