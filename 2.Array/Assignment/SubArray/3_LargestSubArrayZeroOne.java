
/*

3) Largest subarray of 0's and 1's
        Given an array of 0s and 1s. Find the length of the largest subarray with
        equal number of 0s and 1s.

        Example 1:
        Input:
        N = 4
        A[] = {0,1,0,1}
        Output: 4
        Explanation: The array from index [0...3]
        contains equal numbers of 0's and 1's.
        Thus maximum length of subarray having
        equal number of 0's and 1's is 4.

        Example 2:
        Input:
        N = 5
        A[] = {0,0,1,0,0}
        Output: 2
        
        Expected Time Complexity: O(N).
        Expected Auxiliary Space: O(N).
        Constraints:
        1 <= N <= 10^5
        0 <= A[] <= 1.


 */




package Assignment.SubArray;
import java.util.*;

class LargestSubArray{

    static int largestSubArray(int arr[]){
        
        int max = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sum += -1;
            } 
            
            else if (arr[i] == 1) {
                sum += +1; 
            }

            if (map.containsKey(sum)) {
                int temp = map.get(sum);
                int length = i - temp;

                if (length > max) {
                    max = length;
                }

            } 

            else {
                map.put(sum, i);
            }
        }

        return max;
    }
    

    public static void main(String[] args) {

        int  A[] = {0,0,1,0,0};

        System.out.println(largestSubArray(A));
    }
}