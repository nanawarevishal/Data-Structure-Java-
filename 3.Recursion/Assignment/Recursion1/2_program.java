
/*
 2. WAP to display the first 10 natural numbers in reverse order.

 */


package Assignment.Recursion1;

class Program2{

    static void printnum(int n){

        if(n<=10){

            printnum(n+1);
            System.out.println(n);
        }

        return;
    }

    public static void main(String[] args) {
        
        printnum(1);
    }
}
