
/*

Q1. Max Min of an Array
        Problem Description
        - Given an array A of size N.
        - You need to find the sum of the Maximum and Minimum

        elements in the given array.

        Problem Constraints
        1 <= N <= 105
        -109 <= A[i] <= 109

        Example Input
        Input 1:
        A = [-2, 1, -4, 5, 3]
        Input 2:
        A = [1, 3, 4, 1]

        Example Output
        Output 1:
        1
        Output 2:
        5
        Example Explanation
        Explanation 1:
        Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
        Explanation 2:
        Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.

 */



package Assignment.ArrayAssingment01;

public class MinMaxElementSum {

    static int minMaxElementSum(int[] arr){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max = arr[i];
            }

            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min+max;
    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, -4, 5, 3};

        System.out.println(minMaxElementSum(arr));

    }
}
