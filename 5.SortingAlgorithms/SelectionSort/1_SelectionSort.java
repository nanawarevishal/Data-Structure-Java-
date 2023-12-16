

package SelectionSort;

class Selectionsort{

    static void selectionSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){

            int minInd = i;

            for(int j=i+1;j<arr.length;j++){

                if(arr[j]<arr[minInd]){
                    minInd = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }

   public static void main(String[] args) {

        int arr[] = {9,2,7,3,1,8,4,6};

        selectionSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
   }
}
