public class min {
    public static void main(String[] args) {
        int [] arr = {99,55,22,66,44,33,77,11,88};
        int ans = minn(arr);
        System.out.println(ans);
    }
    static int minn(int arr[]){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(ans > arr[i]){
                ans = arr[i]; 
            }
        }
        return ans;
    }

}
