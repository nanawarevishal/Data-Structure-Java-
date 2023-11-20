


/*
 1. WAP to print the numbers between 1 to 10.

 */

package Assignment.Recursion1;


class Program1{

    static void printNum(int n){

        if(n<=10){
            System.out.println(n);

            printNum(n+1);
        }

        return;
    }

    public static void main(String[] args) {
        
        printNum(1);
    }
}