public class factorial {
    static void factorial1(int n,int fact,int i){

        // if(n==0){
        //     System.out.println(fact);
        //     return;
        // }

        // factorial1(n-1,fact*n);

        if(i>n){
            System.out.println(fact);
            return;
        }

        factorial1(n, fact*i, i+1);
    }

    public static void main(String[] args) {
        
        int i =1;
        int n=5;
        int fact =1;
        factorial1(n,fact,i);
    }
}
