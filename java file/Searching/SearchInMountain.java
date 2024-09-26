public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }


    static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    
    }


    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) /2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }
}
