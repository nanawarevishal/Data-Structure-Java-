
/*

Example 9
        Given a sorted array arr containing n elements with possibly some duplicate, the task is to find
        the first and last occurrences of an element x in the given array.
        Note: If the number x is not found in the array then return both the indices as -1.

        Example 1:
        Input:
        n=9, x=5
        arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
        Output:
        2 5
        Explanation:
        First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.
        Example 2:
        Input:
        n=9, x=7
        arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
        Output:
        6 6
        Explanation:
        First and last occurrence of 7 is at index 6.


 */



package Assignment.MagicSession01;

class SearchOccurance{

    static void firstLastOccurance(int[] arr,int target){

        int ind = binarySearch(arr, target);
        int firstOccurance = -1;
        int lastOccurance  = -1;

        if(ind!=-1){

            for(int i = ind;i>=0;i--){
                if(arr[i]!=target){
                    firstOccurance = i+1;
                    break;
                }
            }

            for(int i=ind;i<arr.length;i++){
                if(arr[i]!=target){
                    lastOccurance = i-1;
                    break;
                }
            }
        }

        System.out.println("First Occurance: "+firstOccurance);
        System.out.println("Last Occurance: "+lastOccurance);
    }

    static int binarySearch(int[] arr,int target){

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int mid = (right-left)+left/2;

            if(arr[mid]==target){
                return mid;
            }

            else if(arr[mid]>target){
                right = mid -1;
            }

            else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int  x=5;
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };

        firstLastOccurance(arr, x);
    }
}

