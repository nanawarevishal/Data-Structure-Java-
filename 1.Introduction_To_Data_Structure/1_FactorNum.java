import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Factor{
    
    static ArrayList<Integer> factorNumBruteForce(int num){

        ArrayList<Integer>ls = new ArrayList<>();

        for(int i=1;i<=num;i++){
            if(num % i==0){
                ls.add(i);
            }
        }

        return ls;
    }

    static ArrayList<Integer> factorOptimal(int num){

        ArrayList<Integer>ls = new ArrayList<>();
        ls.add(1);
        for(int i=2;i<=num/2;i++){
            if(num % i==0){
                ls.add(i);
            }
        }
        ls.add(num);
       
        return ls;
    }

    static ArrayList<Integer> factoArrayListAdvance(int num){

        ArrayList<Integer>ls = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num % i==0 ){
                if(i==num/i){
                    ls.add(num/i);
                }
                else{
                    ls.add(i);
                    ls.add(num/i);
                }
            }
        }
        ls.add(num);
       

        return ls;
    }

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());

        // ArrayList<Integer>ls = factorNumBruteForce(num);
        // ArrayList<Integer>ls = factorNumBruteForce(num);

        ArrayList<Integer>ls = factoArrayListAdvance(num);

        System.out.println(ls);

    }

}