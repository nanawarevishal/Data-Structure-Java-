package QuickSort;

import java.util.Arrays;

class QuickSort{

    static int partition(int arr[],int start,int end){

        int pivot = arr[end];
        int i = start-1;

        for(int j= start;j<end;j++){

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


    static void quickSort(int arr[],int start,int end){

        if(start<end){

            int partition = partition(arr,start,end);
            quickSort(arr, start, partition-1);
            quickSort(arr, partition+1, end);

        }
    }

    public static void main(String[] args) {
        
        int arr[] = {9,7,1,2,4,5,20};

        quickSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
}
