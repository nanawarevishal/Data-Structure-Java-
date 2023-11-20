package NormalRecursion;

class Recusion{

    static int fun(int n){
        if(n<=0){
            return 1;
        }

        int ans1 = n + fun(n-1);

        int ans2 = n + fun(n-2);

        return ans1+ans2;
    }

    public static void main(String[] args) {
        System.out.println(fun(2));
    }
}
