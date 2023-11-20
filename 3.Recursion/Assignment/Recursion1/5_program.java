
/*
 5. WAP to check whether the number is prime or not.
 */


package Assignment.Recursion1;

class Program5{

    static boolean isPrime(int n){

        if(n==1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){

            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    static boolean isPrimerecursive(int n,int i){

        if(n==1){
            return false;
        }

        if(n%i==0){
            return false;
        }

        if(i>Math.sqrt(n)){
            return true;
        }

        return isPrimerecursive(n, ++i);
    }

    public static void main(String[] args) {

        // System.out.println(isPrime(4));

        System.out.println(isPrimerecursive(11, 2));
    }
}
