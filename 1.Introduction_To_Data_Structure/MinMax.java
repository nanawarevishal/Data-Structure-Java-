


class SubArrayMinMax{

    static int subArrayMinMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        // System.out.println(max);
        // System.out.println(min);

        int len = arr.length;
        int curr = -1;
        int prev = -1;
        int maxInd = -1;
        int  minInd = -1;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==max){

                if(prev == min){
                    len = Math.min(i-minInd+1,len);
                }
                prev = curr;
                curr = arr[i];
                maxInd = i;
            }

            if(arr[i]==min){

                if(prev == max){
                    len = Math.min(i-maxInd+1,len);
                }
                prev = curr;
                curr = arr[i];
                minInd = i;
            }
        }

        return len;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,1,3,4,6,4,6,3};

        System.out.println(subArrayMinMax(arr));
    }
}