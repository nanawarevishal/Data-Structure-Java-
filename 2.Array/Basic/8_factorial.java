package Basic;

class Factorial{

    static int factorail(int N){

        if(N==0 ||N==1){
            return 1;
        }

        return N * factorail(N-1);
    }

    public static void main(String[] args) {
        System.out.println(factorail(4));
    }
}
