
/*

    10. WAP to check whether the given number is palindrome or not.

 */


package Assignment.Recursion1;

class Program10{

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
