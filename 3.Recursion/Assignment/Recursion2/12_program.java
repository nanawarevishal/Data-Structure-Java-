

/*
Q. 12
        Write a program to determine whether a given positive integer is a composite
        number or not.
 */

package Assignment.Recursion2;

class Program12{

    static boolean isComposite(int n,int i){

        if(n==1){
            return true;
        }

        if(i > Math.sqrt(n)){
            return false;
        }

        if(n % i==0){
            return true;
        }

        return isComposite(n, ++i);
    }

    public static void main(String[] args) {
        
        System.out.println(isComposite(13, 2));
    }
}