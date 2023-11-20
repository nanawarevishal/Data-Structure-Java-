
/*
 4. WAP to print the length of digits in a number.
 */


package Assignment.Recursion1;

class Program4{

    static int lenDigits(int n,int len){

        if(n==0){
            return len;
        }

        return lenDigits(n/10,++len);
    }

    public static void main(String[] args) {
        
        System.out.println(lenDigits(12345000, 0));
    }
}
