
/*
Q. 10
        Write a program to check if a given number is an Armstrong number or not.
        ( An Armstrong number is a number that is equal to the sum of its own digits each
        raised to the power of the number of digits.)
 */


package Assignment.Recursion2;

class Program10{

    static int sum = 0;
    static boolean isAmstrong(int n,int pow,int n1){

        if(n==0 && sum == n1){
            return true;
        }

        if(n==0 && sum !=n1){
            return false;
        }

        sum += Math.pow(n % 10, pow);

        return isAmstrong(n/10, pow, n1);
    }

    public static void main(String[] args) {

        int n = 497;
        
        System.out.println(isAmstrong(n,new String(n+"").length(), n));
    }
}
