package Assignment.Recursion2;

class Program3{

    static int maxDigits = Integer.MIN_VALUE;
    static int maxDigits(int n){

        if(n==0){
            return maxDigits;
        }

        maxDigits = Math.max(maxDigits, n%10);

        return maxDigits(n/10);
    }

    public static void main(String[] args) {
        
        System.out.println(maxDigits(1376532));
    }
}
