class Recursion {

    static void func(int i, int sum) {

        if(i<0){
            return;
        }
        
        func(i-1, sum+i);      
        System.out.println(sum);
    }

    public static void main(String[] args) {

        int n=4;
        func(n, 0);

    }
}
