import java.util.HashMap;

public class subArraySum {

    static int subArray(int[] arr){

        HashMap<Integer,Integer>hm = new HashMap<>();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
           hm.put(i,sum);
        }

        System.out.println(hm);

        return 0;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};

        System.out.println(subArray(arr));
    }
}
