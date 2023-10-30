

/*

Problem 2:
        Given an array of non-negative integers representing a number, implement a function to
        simulate the carry forward operation that occurs when adding 1 to the number represented by
        the array. The array represents the digits of the number, where the 0th index is the least
        significant digit. Your task is to handle the carry forward operation correctly, updating the array
        accordingly. The function should return the resulting array.
        For example, given the input array [1, 9, 9], representing the number 199, the function should
        return [2, 0, 0], representing the result of adding 1 to 199 with the carry forward properly
        handled.
        Consider edge cases such as when the number has trailing zeros or when the carry forward
        results in an additional digit. Optimize your solution for efficiency and discuss the time and
        space complexity of your algorithm.

 */



package Assignment.MagicSession01;


class ArraySum{

    static int[] arraySum(int[] nums){
        
       String str = "";

       for(int i=0;i<nums.length;i++){
            str +=nums[i];
       }

       System.out.println(str);

       int carry = 0;
       String s = "";
       int sum = str.charAt(str.length()-1)-48+1;
       s = sum %10+"";
       carry = sum /10;
       
       for(int i=str.length()-2;i>=0;i--){
            sum = str.charAt(i)-48+carry;
            s = (sum%10) + s;
            carry = sum /10;
       }

       if(carry>0){
            s = carry +s;
       }

       System.out.println(s);

       int result[] = new int[s.length()];

       for(int i=0;i<s.length();i++){
            result[i] = s.charAt(i)-48;
       }

       return result;

    }


    public static void main(String[] args) {
        int[] arr = {1,9,9};

        int []nums = arraySum(arr);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}


