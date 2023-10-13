package Basic;

class ElementCountGreater{

    static int ElementCountGreaterBruteForce(int[] arr){

        int count = 0;
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    count++;
                    break;
                }
            }

        }
        return count;
    }

    static int ElementCountGreaterOptimal(int[] arr){

        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                maxCount++;
            }
        }

        return arr.length-maxCount;
    }

    public static void main(String[] args) {
        
        int[] arr = {2,5,1,4,8,0,8,1,3,8};

        System.out.println(ElementCountGreaterBruteForce(arr));
        System.out.println(ElementCountGreaterOptimal(arr));
    }
}


/*
 * Time Complexity : 
 *                  Brute Force : O(N*N)
 *                  Optimal     : O(N)
 * 
 */
