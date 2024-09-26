public class RBSDupli {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 0;
        boolean ans = search(arr, target);
        System.out.println(ans);
    }

    public static boolean search(int[] nums, int target) {
        int ans = asearch(nums, target);
        if(ans == -1){
            return false;
        }
        return true;
    }


    public static int asearch(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);

    }

    static int findPivot(int []nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid-1;
            }
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                if(start < end && nums[start] > nums[start + 1]){
                    return start;
                }
                start++;
                if(start < end && nums[end] < nums[end - 1]){
                    return end - 1;
                }
                end--;
            }
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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
}
