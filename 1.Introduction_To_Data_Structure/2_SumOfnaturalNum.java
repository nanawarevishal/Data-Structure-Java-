import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SumOfNum{

    static int sumOfNumberbruteForce(int n){

        int sum = 0;

        for(int i=1;i<=n;i++){
            sum +=i;
        }

        return sum;
    }

    static int OptimisedSum(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println(OptimisedSum(num));
    
    }
}
