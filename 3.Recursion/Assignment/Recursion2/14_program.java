

/*
 Q14.
        Write a Java program to determine whether a given positive integer is an
        automorphic number or not.
        (An automorphic number (also known as a circular number) is a number whose
        square ends with the same digits as the number itself)
 */

package Assignment.Recursion2;

class Program14{

    static boolean isAutomorphic(int n,int square,int count,int i){
        
        if(count>new String(n+"").length()){
            return true;
        }

        else if(new String(n+" ").charAt(i)!=new String(square+"").charAt(new String(square+"").length()-new String(n+"").length()+i)){
            return false;
        }

        return isAutomorphic(n, square, ++count, ++i);
    }

    public static void main(String[] args) {

        int n = 25;
        int square = n*n;
        
        System.out.println(isAutomorphic(n, square, 0,0));

        
    }
}
