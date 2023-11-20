package BinarySearch;

class BinarySearchIterative{

    static int binarySeachMethod(int arr[],int target){

        int left = 0;
        int right = arr.length-1;

        while(left<=right){

            int mid = left + (right-left)/2 ;
           
            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]>target){
                right = mid - 1;
            }

            else{
                left = mid + 1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {4,7,11,24,37,55,75,87};

        System.out.println(binarySeachMethod(arr, 55));

    }
}