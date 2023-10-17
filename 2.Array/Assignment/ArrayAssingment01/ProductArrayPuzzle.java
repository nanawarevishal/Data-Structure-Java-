
/*
 Q6. Product array puzzle
        Problem Description
        - Given an array of integers A, find and return the product array of the same
        size where the ith element of the product array will be equal to the

        product of all the elements divided by the ith element of the array.

        - Note: It is always possible to form the product array with integer (32 bit)
        values. Solve it without using the division operator.

        Constraints
        2 <= length of the array <= 1000
        1 <= A[i] <= 10
        For Example
        Input 1:
        A = [1, 2, 3, 4, 5]
        Output 1:
        [120, 60, 40, 30, 24]
        Input 2:
        A = [5, 1, 10, 1]
        Output 2:
        [10, 50, 5, 50]

    ======================================================================================
 */



package Assignment.ArrayAssingment01;


public class ProductArrayPuzzle {

    static int[] productArraypuzzle(int[] arr){

        int prefixProd[] = new int[arr.length];
        int suffixProd[] = new int[arr.length];

        prefixProd[0] = 1;
        suffixProd[arr.length-1] =1;
        for(int i=1;i<arr.length;i++){
            prefixProd[i] = prefixProd[i-1]*arr[i-1];
            suffixProd[arr.length-1-i] = arr[arr.length-i]*suffixProd[arr.length-i];
        }
        
        int[] prodArray = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            prodArray[i] = prefixProd[i]*suffixProd[i];
        }

        return prodArray;
    }

    public static void main(String[] args) {

        int  A[] = {1, 2, 3, 4, 5};

        int prodArray[] = productArraypuzzle(A);

        for(int i=0;i<A.length;i++){
            System.out.print(prodArray[i]+" ");
        }

    }
}
