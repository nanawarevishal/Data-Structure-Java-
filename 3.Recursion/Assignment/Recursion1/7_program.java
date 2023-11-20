

/*

 7. WAP to find the factorial of a number.

 */


package Assignment.Recursion1;

class Program7{

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

