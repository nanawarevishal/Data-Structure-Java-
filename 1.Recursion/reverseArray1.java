public class reverseArray1 {
    
    static void reverseArray(int start,int end,int nums[]){

        if(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            reverseArray(start+1, end-1, nums);
        }

    }

    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5};
        reverseArray(0,a.length-1,a);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
