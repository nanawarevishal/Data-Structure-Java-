package SubArray;

class CountSubArry{

    static int countSubArray(int[] nums){

        int count = 0;
        for(int i=0;i<nums.length;i++){
            
            for(int j=i;j<nums.length;j++){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int arr[] = {4,2,10,2,12,-2,15};
        System.out.println(countSubArray(arr));

    }
}

/*
 * Time Complexity:
 *                  Brute Force : O(N^2)
 * 
 */