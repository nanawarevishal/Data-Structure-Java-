package Easy;

import java.util.HashSet;

public class MissingNoArray {

    static int bruteforce(int[] a ,int n){

        for(int i=1;i<=n;i++){

            boolean flag = false;
            for(int j=0;j<a.length;j++){

                if(a[j]==i){

                    flag = true;
                    break;
                }
            }
            if(!flag){
                return i;
            }
        }

        return -1;
    }

    static int better(int[] a,int n){

        int[] hash = new int[n+1];

        for(int i=0;i<n-1;i++){

            hash[a[i]]=a[i];
        }

        for(int i=1;i<=n;i++){

            if(hash[i]==0){
                return i;
            }
        }

        return -1;
    }

    static int Optimal(int[] a,int n){

        int sum = n*(n+1)/2;
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1+=a[i];
        }

        return sum-sum1;
    }

    static int optimalex(int[] a,int n){
        int xor1=0,xor2=0;

        for(int i=0;i<a.length;i++){

            xor2 = xor2^a[i];
            xor1 =xor1 ^ (i+1);
        }
        xor1 = xor1^n;
        return xor1^xor2;
    }
    public static void main(String[] args) {
        
        int[] a = {1,2,4,5};
        int n=5;

       System.out.println(bruteforce(a,n));

       System.out.println(better(a, n));

       System.out.println(Optimal(a, n));

       System.out.println(optimalex(a, n));

    }
}
