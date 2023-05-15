package Easy;

public class removeDuplicate {
    
    static int[] removeDuplicates(int[] arr){
        
        int i = 0;
        
        for(int j=1;j<arr.length;j++){

            if(arr[j]!=arr[i]){

                arr[i+1] = arr[j];
                i++;
            }
        }
        for(int k=i+1;k<arr.length;k++){
            arr[k] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};

        int a[] = removeDuplicates(arr);

        for(int i=0;i<a.length;i++)  {

            System.out.print(a[i]+" ");
        }
      }
}
