
/*
 1. Reverse Integer (Leetcode:- 7)
        Given a signed 32-bit integer x, return x with its digits reversed. If reversing
        x causes the value to go outside the signed 32-bit integer range [-231, 231
        - 1], then return 0.
        Assume the environment does not allow you to store 64-bit integers (signed
        or unsigned).
        Example 1:
        Input: x = 123
        Output: 321
        Example 2:
        Input: x = -123
        Output: -321
        Example 3:
        Input: x = 120
        Output: 21

        Constraints:
        -231 <= x <= 231 - 1
 */


package Assignment.LeetCode;

public class reveraInteger {

    static int reverse(int x) {

        if(x==0){
            return 0;
        }
        
         if(x<=Integer.MIN_VALUE){
            return 0;
        }

        int sum = 0;
        boolean flag = false;
        if(x<0){
            flag = true;
            Math.abs(x);
            x = 0-x;
        }

        int num = x;


        String str = "";

        while(x!=0){

            str +=(x%10);
            sum  = sum *10+(x%10);

            x/=10;

        }

        long p = 0;


        p = Long.parseLong(str);


        if(flag){

            p = 0-p;
            sum = 0-sum;
        }

        // System.out.println(p);

        if(p>=Integer.MAX_VALUE || p<=Integer.MIN_VALUE){

            return 0;
        }

        // System.out.println(sum);

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }
}
