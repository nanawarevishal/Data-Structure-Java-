
/*
 Q.1
        Write a program to print the factorial of a given number.
 */



package Assignment.Recursion2;

class Program1{

    static int fact = 1;

    static int factorial(int n){

        if(n<=1){
            return n;
        }

        // fact *= n;

        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        
        System.out.println(factorial(5));
    }
}

