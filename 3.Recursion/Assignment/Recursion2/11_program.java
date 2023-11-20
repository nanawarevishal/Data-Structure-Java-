

/*

Q. 11
    Write a program to check if a given number is a Harshad Number or not.
    (A Harshad Number is a number that is divisible by the sum of its digits.)

 */

package Assignment.Recursion2;

class Program11{

    static int sum = 0;

    static boolean isHarshadNumber(int n,int n1){

        if(n==0 && n1%sum==0){
            return true;
        }

        if(n==0 && n1%sum == 1){
            return false;
        }

        sum += n %10;

        return isHarshadNumber(n/10,n1);

    }

    public static void main(String[] args) {
        
        System.out.println(isHarshadNumber(11,11));
    }
}