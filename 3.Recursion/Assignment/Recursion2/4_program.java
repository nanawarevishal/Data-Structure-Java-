
/*
 Q. 4
    Write a program to print the sum of odd numbers up to a given number.
 */


package Assignment.Recursion2;

class Program4{

    static int sum = 0;

    static int sumofodddDigits(int n){
        if(n==0){
            return sum;
        }

        if((n%10)%2==1){
            sum +=n%10;
        }

        return sumofodddDigits(n/10);
    }

    public static void main(String[] args) {
        
        System.out.println(sumofodddDigits(1356739));
    }
}
