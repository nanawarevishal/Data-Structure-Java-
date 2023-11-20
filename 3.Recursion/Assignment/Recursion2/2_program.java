

/*
 Q. 2
    Write a program to print the product of digits of a given number.
 */


package Assignment.Recursion2;

class Program2{

    static int prod = 1;
    static int productOfDigits(int n){

        if(n==0){
            return prod;
        }

        prod *= n%10;

        return productOfDigits(n/10);
    }

    public static void main(String[] args) {
        
        System.out.println(productOfDigits(1234));
    }
    
}