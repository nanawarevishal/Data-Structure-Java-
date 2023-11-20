

/*
 
    8. WAP to count the occurrence of a specific digit in a given number.

 */


package Assignment.Recursion1;


class Program8{

    static int count = 0;
    static int digitCount(int n,int digit){
        
        if(n==0){
            return count;
        }

        if(n%10==digit)
            count++;

        return (digitCount(n/10, digit));
    }

    public static void main(String[] args) {
        
        System.out.println(digitCount(112444534, 4));
    }
}