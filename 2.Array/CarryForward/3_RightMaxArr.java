package CarryForward;

class RightMaxArr{

    static int[] rightMaxArr(int[] arr){

        int rightMax[] = new int[arr.length];

        rightMax[arr.length-1] = arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--){

            if(rightMax[i+1]>arr[i]){
                rightMax[i] = rightMax[i+1];
            }

            else{

                rightMax[i] = arr[i];
            }

        }

        return rightMax;
    }

    public static void main(String[] args) {
        
        int[] nums= {-3,6,2,4,5,2,8,-9,3,1};

        int arr[] = rightMaxArr(nums);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


/*
 * Time Complexity:
 *              Brute Force : O(N*N)
 *              Optimal     :     O(N)
 * 
 * 
 * Space Complexity:
 *                  O(N)
 *              
 */