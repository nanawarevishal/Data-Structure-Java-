package BubbleSort;

class BubbleSortRecursive{

    static void bubbleSortRecursive(int arr[],int i){

        if(i<arr.length){

            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i]>arr[j]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            bubbleSortRecursive(arr, ++i);
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {9,7,1,2,4,5,20};

        bubbleSortRecursive(arr, 0);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
