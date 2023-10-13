package Basic;

class SecondLargestElement{

    static int seclargest(int[] arr){
        
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            }

            else if(secMax<arr[i] && arr[i]!=max){
                secMax = arr[i];
            }
        }

        return secMax;
    }

    public static void main(String[] args) {

        int []arr = {7,6,2,9,3,1,4,8};

        System.out.println(seclargest(arr));
    }
}