package MergeSort;

class MergeSortReverse{

    static void merge(int arr[],int start,int mid,int end){

        int n1 = mid-start+1;
        int n2 = end-mid;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for(int i=0;i<arr1.length;i++){
            arr1[i]= arr[start+i];
        }

        for(int i=0;i<arr2.length;i++){
            arr2[i] = arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k = start;
        while(i<arr1.length && j<arr2.length){

            if(arr1[i] > arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<arr1.length){
            arr[k] = arr1[i];
                i++;
                k++;
        }

        while(j<arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    static void mergerSortReverse(int arr[],int start,int end){

        if(start < end){

            int mid = start + (end-start)/2;
            mergerSortReverse(arr, start, mid);
            mergerSortReverse(arr, mid+1, end);
            merge(arr,start,mid,end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,7,1,2,4,5,20};

        mergerSortReverse(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
