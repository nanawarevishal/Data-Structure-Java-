
/*
 
  6.WAP to calculate the sum of digits of a given positive integer.

 */


package Assignment.Recursion1;

class Program6{

    static int sum = 0;
    static int sumOfDigits(int n){

        if(n==0){
            return sum;
        }

        sum += n%10;

        return sumOfDigits(n/10);
    }

    public static void main(String[] args) {
        
        System.out.println(sumOfDigits(12345));
    }
}
