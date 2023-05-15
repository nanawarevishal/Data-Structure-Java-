public class print1ToN {

    static void print(int n){
        // if(n<=0){
        //     return;
        // }
        // else{
        //     print(n-1);
        //     System.out.println(n);
        // }

        if(n>4){
            return;
        }

        else{
            System.out.println(n);
            print(n+1);
        }
    }
    public static void main(String[] args) {
        
        int n = 1;
        print(n);
    }
}
