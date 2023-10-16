package PrefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Rangesum{

    static int RangeSum(int[] arr,int start,int end){

        int sum = 0;
        for(int i=start;i<=end;i++){

            sum +=arr[i];
        }
        
        return sum;
    }

    public static void main(String[] args)throws IOException {
        
        int[] arr = {2,5,3,11,7,9,4};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start index: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the end index: ");
        int end = Integer.parseInt(br.readLine());

        System.out.println(RangeSum(arr, start, end));
    }
}
