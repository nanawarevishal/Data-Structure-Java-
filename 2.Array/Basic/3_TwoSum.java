package Basic;

import java.util.HashMap;

class Twosum{

    static int twoSumBruteForce(int[] arr,int k){

        int count = 0;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        
        return 2*count;
    }

    static int TwoSumOptimal(int[] arr,int k){

        HashMap<Integer,Integer>hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){

            int req = k-arr[i];

            if(hm.containsKey(req)){
                count++;
            }

            hm.put(arr[i],i);
        }

        return 2*count;
    }

    public static void main(String[] args) {
        
        int[] arr= {3,5,2,1,-3,7,8,15,6,13};

        System.out.println(twoSumBruteForce(arr, 10));

        System.out.println(TwoSumOptimal(arr, 10));
    }
}


/*
 * Time Complexity : 
 *                  Brute Force : O(N*N)
 *                  Optimal     : O(N)
 * 
 */
