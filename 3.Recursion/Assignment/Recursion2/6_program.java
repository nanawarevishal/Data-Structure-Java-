
/*
 Q. 6
        Write a program to check whether a given number is a Strong Number or not.
 */


package Assignment.Recursion2;

class Program6{

    static int sum = 0;
    static boolean isStrongnum(int n,int n1){
        if(n==0 && sum==n1){
            return true;
        }

        else if(n==0 && sum !=n1){
            return false;
        }

        sum +=factorial(n%10);

        return isStrongnum(n/10, n1);
    }

    static int factorial(int n){

        if(n==0){
            return 1;
        }

        if(n==1){
            return n;
        }

        return n* factorial(n-1);
    }

    public static void main(String[] args) {
        
        System.out.println(isStrongnum(145,145));
    }
}