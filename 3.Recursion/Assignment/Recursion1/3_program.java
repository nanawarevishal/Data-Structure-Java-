
/*
 3. WAP to print the sum of n natural numbers.

 */


package Assignment.Recursion1;


class Program3{

    static void sumNum(int n,int sum){

        if(n<=0){

            System.out.println(sum);
            return;
        }
        // sum += n;
        sumNum(n-1,sum+=n);
    }

    public static void main(String[] args) {
        
        sumNum(10, 0);
    }

}