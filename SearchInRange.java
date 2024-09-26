public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {99,55,22,0,44,33,77,11,88};
        int target = 44;
        int ans = Search(arr, target, 1, 6);
        System.out.println(ans);
    }

    static int Search(int []arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i < end; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;

    }
}
