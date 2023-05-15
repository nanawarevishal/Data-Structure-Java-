package Easy;

import java.util.ArrayList;
import java.util.List;

public class moveZeros {

    static int[] bruteforce(int[] nums){

        List<Integer>ls = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ls.add(nums[i]);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(ls.size()>i){
                nums[i] = ls.get(i);
            }

            else{
                nums[i] =0;
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        return nums;
    }

    static void Optimal(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==0){
                j=i;
                break;
            }
        }

        for(int i=j+1;i<nums.length;i++){

            if(nums[i]!=0 && nums[j]==0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        int nums[] = {1,2,0,3,0,4,5,0,1,7,0,0};

        // int[] a = bruteforce(nums);

        Optimal(nums);
    }
}
