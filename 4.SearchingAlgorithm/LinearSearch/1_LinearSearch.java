

package LinearSearch;

class LinearSearch{

    static int linearSearch(int[] arr,int ind,int target){

        if(ind>arr.length){
            return -1;
        }

        if(arr[ind]==target){
            return ind;
        }

       return linearSearch(arr, ind+1, target);
       
    }

    public static void main(String[] args) {
        
        int[] arr= {4,7,11,24,37,55,75,87};

        System.out.println(linearSearch(arr, 0, 11));
    }
}