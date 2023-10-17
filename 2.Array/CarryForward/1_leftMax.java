package CarryForward;


class CarryForward{

    static int leftMax(int[] arr, int ind){

        int max = Integer.MIN_VALUE;
        for(int i=0;i<=ind;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        
        int []arr= {3,4,5,1,2,7,9,8};

        System.out.println(leftMax(arr, 3));
    }
}


/*
 * Time Complexity:
 *              Optimal: O(N)
 * 
 * 
 * Space Complexity:
 *              O(1)
 *              
 */