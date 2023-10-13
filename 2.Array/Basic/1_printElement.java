
package Basic;

class PrintElement{

    static void print(){
        int arr[] = {5,6,2,3,1,9};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        print();
    }
}

/*
    Time Complexity: O(N)
    Space Complexity: O(1)
    
 */


