
/*

 Q. 9
        Write a program to determine whether a given number is a happy number or not.

        (A happy number is a number which eventually reaches 1 when replaced by the
        sum of the square of each digit.)

 */



package Assignment.Recursion2;

class Program9{
    
    static boolean isHappyNum(int n){

        n = powerOfDigits(n,0);

        if(n==1){
            return true;
        }

        if(n!=1 && new String(n+"").length()==1){
            return false;
        }

        return isHappyNum(n);

    }

    // static int sum = 0;
    static int powerOfDigits(int n,int sum){

        if(n==0){
            return sum;
        } 

        sum +=Math.pow(n % 10 ,2);

        return powerOfDigits(n/10,sum);
    }


    public static void main(String[] args) {
        
        System.out.println(isHappyNum(20));
        
    }
}