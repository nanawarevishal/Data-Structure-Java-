package Basic;

import java.util.ArrayList;

class SuccessiveNum{

    static ArrayList<Integer> successiveSum(int n){
        ArrayList<Integer> ls = new ArrayList<>();

        String str = n+"";

        for(int i=str.length()-1;i>=1;i--){
            ls.add(((str.charAt(i)-48)+(str.charAt(i-1)-48)));
        }

        ls.add(str.charAt(0)-48);


        return ls;
    }

    public static void main(String[] args) {
        
        System.out.println(successiveSum(45689));
    }
}
