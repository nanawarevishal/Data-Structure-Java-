
/*
 Q4. Time to equality
            Problem Description
            - Given an integer array A of size N.
            - In one second, you can increase the value of one element by 1.
            - Find the minimum time in seconds to make all elements of the array

            equal.

            Problem Constraints
            1 <= N <= 1000000
            1 <= A[i] <= 1000

            Example Input
            A = [2, 4, 1, 3, 2]
            Example Output
            8

            Example Explanation
            We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8

            seconds.

    =========================================================================================
 */



package Assignment.ArrayAssingment01;

public class TimeToEquality {

    static int TimeToEqualitys(int[] arr){

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int time = 0;
        for(int i=0;i<arr.length;i++){
            time +=max - arr[i];
        }

        return time;
    }
    public static void main(String[] args) {
        int A[] = {2, 4, 1, 3, 2};

        System.out.println(TimeToEqualitys(A));
    }
}
