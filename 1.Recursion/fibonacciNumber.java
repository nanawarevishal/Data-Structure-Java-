public class fibonacciNumber {
    static void fibo(int n1,int n2,int n,int i){

        if(i>n){
            return;
        }
        System.out.println(n1);
        int n3= n1+n2;
        fibo(n2,n3,n, i+1);
    }

    public static void main(String[] args) {

        int n1=0,n2=1,n=10,i=1;
        fibo(n1,n2,n,i);
    }
}
