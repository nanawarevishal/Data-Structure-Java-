package MergeSort;

class MergeSort{

    static void merge(int arr[],int start,int mid,int end){
        int n1 = mid - start + 1;
		int n2 = end - mid;

		int nums1[] = new int[n1];
		int nums2[] = new int[n2];
		for(int i = 0; i < n1; i++) {
			
			nums1[i] = arr[start + i];
		}

		for(int i = 0; i < n2; i++) {
			
			nums2[i] = arr[mid + i + 1];
		}

		int i = 0, j = 0, k = start;
		while(i < nums1.length && j < nums2.length) {
			
			if(nums1[i] < nums2[j]) {
				
				arr[k] = nums1[i];
				i++;
			} else {
					
				arr[k] = nums2[j];
				j++;
			}
			k++;
		}

		while(i < nums1.length) {
			
			arr[k] = nums1[i];
			i++;
			k++;
		}

		while(j < nums2.length) {
		
			arr[k] = nums2[j];
			j++;
			k++;
		}
    }

    static void mergeSort(int[] arr,int start,int end){

        if(start < end){

            int mid = start + (end-start)/2;

            mergeSort(arr, start,mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,2,7,3,1,8,4,6};

        mergeSort(arr, 0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}