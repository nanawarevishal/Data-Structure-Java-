
/*
 75. Sort Colors
            Medium
            14.9K
            530
            Companies
            Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

            We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

            You must solve this problem without using the library's sort function.

        
            Example 1:
            Input: nums = [2,0,2,1,1,0]
            Output: [0,0,1,1,2,2]


            Example 2:
            Input: nums = [2,0,1]
            Output: [0,1,2]
 */

package Medium;

import java.util.ArrayList;

public class sortArrayZeroAndOnes {

    static int[] better(int[] nums) {

        int zeroCnt = 0;
        int oneCnt = 0;
        int twoCnt = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zeroCnt++;
            }

            else if (nums[i] == 1) {
                oneCnt++;
            }

            else {
                twoCnt++;
            }
        }

        for (int i = 0; i < zeroCnt; i++) {
            nums[i] = 0;
        }

        for (int i = zeroCnt; i < (oneCnt + zeroCnt); i++) {
            nums[i] = 1;
        }

        for (int i = oneCnt+zeroCnt; i < (twoCnt + oneCnt + zeroCnt); i++) {
            nums[i] = 2;
        }
        return nums;
    }


    static void merge(int[] nums,int low,int mid,int high){
        int left = low;
        int right = mid+1;

        ArrayList<Integer>temp = new ArrayList<>();

        while(left<=mid && right<=high){

            if(nums[left]<=nums[mid]){
                temp.add(nums[left]);
                left++;

            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }

        while(right<=high){
            temp.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            nums[i] = temp.get(i-low);
        }

    }

    static void mergeSort(int[] nums,int low,int high){
        if(low>=high)return;

        int mid = (low+high)/2;

        mergeSort(nums,low,mid);
        mergeSort(nums, mid+1, high);
        merge(nums, low, mid, high);
    }

    

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };

        int[] a = better(nums);

        System.out.println("By using the manual Sorting method:  ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


        System.out.println("\n76By Using Merge Sort Method: ");
        mergeSort(nums, 0, 0);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
