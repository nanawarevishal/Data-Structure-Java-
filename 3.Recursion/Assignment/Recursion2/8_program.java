

/*
    Q. 8
        Write a program to check whether a given positive integer is a Perfect Number or
        not.
        (A Perfect Number is a positive integer that is equal to the sum of its proper
        divisors, excluding itself.)

 */

package Assignment.Recursion2;


class Program8{

    static int sum = 0;
    static boolean isPerfectNumber(int n,int n1,int num){

        if(num>n/2 && sum == n1){
            return true;
        }

        if(num>n/2 && sum !=n1){
            return false;
        }

        if(n%num==0){
            sum +=num;
        }

        return isPerfectNumber(n, n1, ++num);
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(7, 7,1));
    }
}