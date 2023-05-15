package Easy;

public class leftRotateDplaces {

    static int[] rotateArray(int[] arr,int k){

        k = k%arr.length;
        // for(int j=0;j<k;j++){
            
        //     int temp = arr[0];
        //     for(int i=1;i<arr.length;i++){

        //         arr[i-1]=arr[i];
        //     }
    
        //     arr[arr.length-j-1]=temp;

        // }



        // int temp[] = new int[k];

        // for(int i=0;i<k;i++){

        //     temp[i] = arr[i];
        // }

        // for(int i=k;i<arr.length;i++){

        //     arr[i-k] = arr[i];
        // }

        // for(int i=arr.length-k;i<arr.length;i++){
        //     arr[i] = temp[i-(arr.length-k)];

        // }


        //Optimal Solution

        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);

        return arr;

    }

    static void reverse(int[] arr,int start,int end){

        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =temp;

            start++;
            end--;
        }

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        int a[] = rotateArray(arr,k);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
