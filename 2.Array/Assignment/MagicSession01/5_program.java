

/*

Problem 5
        Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find
        the missing element.

        Example 1:
        Input:
        N = 5
        A[] = {1,2,3,5}
        Output: 4.

        Example 2:
        Input:
        N = 10
        A[] = {6,1,2,8,3,4,7,10,5}
        Output: 9.

        Your Task :
        You don't need to read input or print anything. Complete the function MissingNumber() that
        takes array and N as input parameters and returns the value of the missing number.

        Expected Time Complexity: O(N)
        Expected Auxiliary Space: O(1)

        Constraints:
        1 ≤ N ≤ 106
        1 ≤ A[i] ≤ 106

 */



package Assignment.MagicSession01;

class MissingElement{

    static int missingElement(int nums[]){

        int actualSum = 0;
        for(int i=0;i<nums.length;i++){
            actualSum +=nums[i];
        }

        System.out.println(actualSum);
    

        int sum = nums.length*(nums.length + 1)/2;

        System.out.println(sum);

        if(sum-actualSum!=0){
            return (sum - actualSum);
        }

        return nums.length;
    }

    public static void main(String[] args) {
        int  A[] = {6,1,2,8,3,4,7,10,5};

        System.out.println(missingElement(A));
    }
}
