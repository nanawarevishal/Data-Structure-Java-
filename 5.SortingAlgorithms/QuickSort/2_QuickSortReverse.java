package QuickSort;

import java.util.Arrays;

class QuickSortReverse{

    static int Partition(int[] arr,int start,int end){

        int pivot = arr[end];
        int i = start -1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }

    static void quickSortReverse(int arr[],int start,int end){

        if(start < end){
            int partitionIndex = Partition(arr, start, end);
            quickSortReverse(arr, start, partitionIndex-1);
            quickSortReverse(arr, partitionIndex+1, end);
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {12,7,6,14,5,15,10};

        quickSortReverse(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
