
/*
 Q5. In-place Prefix Sum
            Problem Description
            - Given an array A of N integers.
            - Construct the prefix sum of the array in the given array itself.

            Problem Constraints
            1 <= N <= 105
            1 <= A[i] <= 103

            Example Input
            Input 1:
            A = [1, 2, 3, 4, 5]
            Input 2:
            A = [4, 3, 2]

            Example Output
            Output 1:
            [1, 3, 6, 10, 15]
            Output 2:
            [4, 7, 9]

            Example Explanation

            Explanation 1:
            The prefix sum array of [1, 2, 3, 4, 5] is [1, 3, 6, 10, 15].
            Explanation 2:
            The prefix sum array of [4, 3, 2] is [4, 7, 9].

    =======================================================================================
 */




package Assignment.ArrayAssingment01;

public class InplacePrefixSum {

    static int[] prefixSumArray(int[] arr){

        int prefixSum[] = new int[arr.length];

        prefixSum[0] = arr[0];
        for(int i=1;i<arr.length;i++){

            prefixSum[i] = prefixSum[i-1]+arr[i];
        }

        return prefixSum;
    }
    
    public static void main(String[] args) {
        int  A[] = {1, 2, 3, 4, 5};

        int prefixSum[] = prefixSumArray(A);

        for(int i=0;i<prefixSum.length;i++){
            System.out.print(prefixSum[i]+" ");
        }
    }
}
