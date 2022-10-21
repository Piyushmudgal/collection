package collection;

public class Arrays {
    public static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if (target == arr[mid])     return mid;
            else if(target < arr[mid])    end = mid-1;
            else    start=mid+1;
        }
        return -1;
    }
}
