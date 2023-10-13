
import java.util.*;

class EquilibriumPoint{

    static int EquilibriumPoints(int[] arr){

        HashMap<Integer,Integer>hm = new HashMap<>();
        int prefixSum[] = new int[arr.length];

        int sum = 0;
        for(int i=0;i<arr.length;i++){

            // hm.put(arr[i],sum);
            prefixSum[i] = sum;
            sum +=arr[i];
        }

        // System.out.println(hm);

        sum = 0;
        for(int i=arr.length-1;i>=0;i--){
            // if(hm.get(arr[i])==sum && i!=arr.length-1){
            //     return i;
            // }
            if(prefixSum[i]==sum && i!=arr.length-1){
                return i;
            }

            sum +=arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {-7,1,5,2,-4,3,0};

        System.out.println(EquilibriumPoints(arr));
    }
}