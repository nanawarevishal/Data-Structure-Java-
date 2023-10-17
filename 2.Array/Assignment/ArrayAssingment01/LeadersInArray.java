
/*
 Q7. Leaders in an array

        Problem Description
        - Given an integer array A containing N distinct integers, you have to find all
        the leaders in array A. An element is a leader if it is strictly greater than all

        the elements to its right side.

        NOTE: The rightmost element is always a leader.
        Problem Constraints
        1 <= N <= 105
        1 <= A[i] <= 108

        Example Input
        Input 1:
        A = [16, 17, 4, 3, 5, 2]

        Input 2:
        A = [5, 4]

        Example Output

        Output 1:
        [17, 2, 5]
        
        Output 2:
        [5, 4]

        Example Explanation
        Explanation 1:
        Element 17 is strictly greater than all the elements on the right side to it.
        Element 2 is strictly greater than all the elements on the right side to it.
        Element 5 is strictly greater than all the elements on the right side to it.

        So we will return these three elements i.e [17, 2, 5], we can also return [2,

        5, 17] or [5, 2, 17] or any other ordering.

        Explanation 2:
        Element 5 is strictly greater than all the elements on the right side to it.
        Element 4 is strictly greater than all the elements on the right side to it.
        So we will return these two elements i.e [5, 4], we can also do any other

        ordering.
 */



package Assignment.ArrayAssingment01;

import java.util.ArrayList;

public class LeadersInArray {

    static ArrayList<Integer> LearderInArray(int[] arr){

        ArrayList<Integer>ls = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){

            if(arr[i]>max){
                ls.add(arr[i]);
                max = arr[i];
            }
        }

        return ls;
    }

    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};

        System.out.println(LearderInArray(A));
    }
}
