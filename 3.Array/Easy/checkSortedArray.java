
package Easy;

public class checkSortedArray {
    static boolean isSorted(int[] arr){
        boolean flag  =true;

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                return false;
            }

        }

        return flag;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,1,3,8,9};

        System.out.println(isSorted(arr));
    }
}
