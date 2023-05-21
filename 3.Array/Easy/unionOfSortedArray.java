package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class unionOfSortedArray {
    
    static void bruteforce(int nums1[], int nums2[]){

        Set<Integer>st = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            st.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            st.add(nums2[i]);
        }

       ArrayList<Integer>ls = new ArrayList<>();

       for (Integer integer : st) {
            ls.add(integer);
        }

        int nums[] = new int[ls.size()];

        ls.toArray();
        System.out.println(ls);
        

        System.out.println(st);
    }

    
    public static void main(String[] args) {
        
        int nums1[] = {1,2,2,3,4,5};
        int nums2[] ={2,3,4,4,5,6};

        bruteforce(nums1, nums2);
    }
}


