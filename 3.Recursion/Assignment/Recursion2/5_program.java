
/*
 Q. 5
        Write a program to check whether the given number is a palindrome number or
        not.
 */


package Assignment.Recursion2;

class Program5{

    static int num = 0;
    static boolean isPalindrome(int n,int n1){

        if(n==0 && num==n1){
            return true;
        }

        else if(n==0 && num!=n1){
            return false;
        }


        num = num * 10 +n % 10;

        return isPalindrome(n/10,n1);
    }

    public static void main(String[] args) {
        
        System.out.println(isPalindrome(102, 102));
    }
    
}


