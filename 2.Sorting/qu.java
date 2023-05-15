import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class qu {

    static int partition(List<Integer>arr,int low,int high){
        int i= low;
        int j = high;
        int pivot = arr.get(low);

        while(i<j){

            while(arr.get(i)<=pivot && i<=high-1){
                i++;
            }

            while(arr.get(j)>pivot && j>=low+1){
                j--;
            }

            if(i<j){
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void qs(List<Integer> arr, int low, int high){

        if(low<high){
            int partitionInd = partition(arr,low,high);
            qs(arr, low, partitionInd-1);
            qs(arr, partitionInd+1, high);
        }
    }
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        int n = arr.size();

        System.out.println("Before Quick Sort");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();

        qs(arr, 0, n-1);

        System.out.println("After Quick Sort");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();
        
    }
}
