

class Rotate{

    public static void main(String[] args) {
        //          8 10 12 14 16 18 20 2 4 6
        int arr[] = {2,4,6,8,10,12,14,16,18,20};

        int k = 2 % arr.length;

        int temp[] = new int[k];

        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }

        // for(int i=0;i<temp.length;i++){
        //     System.out.print(temp[i]+" ");
        // }

        for(int i=k;i<arr.length;i++){
            arr[i-(k)] = arr[i];
        }

        int ind =0 ;
        for(int i=arr.length-k;i<arr.length;i++){
            arr[i] = temp[ind];
            ind++;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}