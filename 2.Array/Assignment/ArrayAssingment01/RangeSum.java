
/*
 Q3. Range Sum Query

            Problem Description
            - You are given an integer array A of length N.
            - You are also given a 2D integer array B with dimensions M x 2, where

            each row

            denotes a [L, R] query.
            - For each query, you have to find the sum of all elements from L to R

            indices

            in A (0 - indexed).
            - More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each
            query.

            Problem Constraints
            1 <= N, M <= 103
            1 <= A[i] <= 105
            0 <= L <= R < N

            Example Input
            Input 1:
            A = [1, 2, 3, 4, 5]
            B = [[0, 3], [1, 2]]
            Input 2:
            A = [2, 2, 2]
            B = [[0, 0], [1, 2]]

            Example Output
            Output 1:
            [10, 5]

            Output 2:
            [2, 4]

            Example Explanation
            Explanation 1:
            The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
            The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
            Explanation 2:
            The sum of all elements of A[0 ... 0] = 2 = 2.
            The sum of all elements of A[1 ... 2] = 2 + 2 = 4.

    ======================================================================================
 */




package Assignment.ArrayAssingment01;

import java.util.ArrayList;

public class RangeSum {

    static ArrayList<Integer> RangeSums(int[] arr,int[][] query){
        ArrayList<Integer>ls = new ArrayList<>();

        int prefixSum[] = new int[arr.length];

        prefixSum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }

        for(int i=0;i<query.length;i++){

            int start = query[i][0];
            int end = query[i][1];

            if(start==0){
                ls.add(prefixSum[end]);
            }

            else{
                ls.add(prefixSum[end]-prefixSum[start-1]);
            }
        }

        return ls;
    }

    public static void main(String[] args) {
        int []A = {2, 2, 2};
        int [][]B = {{0, 0}, {1, 2}};

        System.out.println(RangeSums(A, B));
    }
}
