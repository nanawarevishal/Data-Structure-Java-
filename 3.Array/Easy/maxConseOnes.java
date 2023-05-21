

/*
485. Max Consecutive Ones
        Easy
        4.4K
        426
        Companies
        Given a binary array nums, return the maximum number of consecutive 1's in the array.

        

        Example 1:
        Input: nums = [1,1,0,1,1,1]
        Output: 3
        Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

        Example 2:
        Input: nums = [1,0,1,1,0,1]
        Output: 2
 */






package Easy;

public class maxConseOnes {

    static int Optimal(int[] a){
        int maxCount=0;

        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=1){
                count=0;
            }
            else{
                count++;
                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }



    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1};
        System.out.println(Optimal(nums));
        
    }
}
