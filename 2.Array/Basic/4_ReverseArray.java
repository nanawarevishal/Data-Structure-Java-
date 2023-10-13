package Basic;

class ReverseArray{

    static int[] reverseArrayBruteForce(int[] arr){

        int revArray[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            revArray[arr.length-i] = arr[i];
        }
        return revArray;
    }

    static int[] reverseArrayOptimal(int[] arr){
        int left = 0;
        int right =arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        
        return arr;
    }

    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4,5,6,7,8,9,0};

        int ans[] = reverseArrayOptimal(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}


/*
 * Time Complexity : 
 *                  Brute Force : O(N)
 *                  Optimal     : O(N)
 * 
 * 
 * Space Complexity:
 *                  Brute Force : O(N)
 *                  Optimal     : O(1)
 * 
 */