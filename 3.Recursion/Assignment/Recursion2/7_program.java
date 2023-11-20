

/*
 
Q. 7
    Write a program to check if a given number is a Magic Number or not. (A Magic
    Number is a number in which the eventual sum of the digits is equal to 1).

 */


package Assignment.Recursion2;

class Program7{

    static boolean isMagicNumber(int n){

        n = sumOfDigits(n,0);
        if(n==1){
            return true;
        }

        if(n!=1 && new String(n+"").length()==1){
            return false;
        }

        return isMagicNumber(n);

    }

    static int sumOfDigits(int n,int sum){

        if(n==0){
            return sum;
        }

        // sum +=n % 10;

        return sumOfDigits(n/10,sum+=n%10);
    }

    public static void main(String[] args) {
        
        System.out.println(isMagicNumber(11));
    }
}