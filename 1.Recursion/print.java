public class print {

    static void fun(int n,int i){

        if(n>4){
            return;
        }

        fun(n+1,i);
        System.out.println(n);

    }
    public static void main(String[] args) {
        
        int n =1;
        int x =4;
        fun(n,x);
    }
}
