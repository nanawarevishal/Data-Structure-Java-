package BinarySearch;


class BinarySearchRecursive{

    static int binarySearch(int arr[],int left,int right,int target){

        if(left<=right){

            int mid = left +( right-left)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]>target){
                return binarySearch(arr, left, mid-1, target);
            }

            else{
                return binarySearch(arr, mid+1, right, target);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = {4,7,11,24,37,55,75,87};

        System.out.println(binarySearch(arr, 0, arr.length-1, 55));
    }
}