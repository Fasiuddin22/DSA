

public class Linear_Search {
    public static void main(String[] args) {
        int [] arr = {99,55,22,0,44,33,77,11,88};
        int target = 33;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int []arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;

    }
}
