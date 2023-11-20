
/*
 Q. 13
        Write a program to check if a given number is an Abundant Number or not.
        (An Abundant number is the sum of all its proper divisors, denoted by sum(n), is
        greater than the number's value.)
 */


package Assignment.Recursion2;

class Program13{

    static int sum = 0;

    static boolean isAbundantNumber(int n,int ind){

        if(ind>n/2 && sum>n){
            return true;
        }

        if(ind>n/2 && sum<n){
            return false;
        }

        if(n%ind==0){
            sum += n % ind;
        }

        return isAbundantNumber(n, ++ind);
    }

    public static void main(String[] args) {
        
        System.out.println(isAbundantNumber(12, 1));
    }
}


