public class binarySearch {
    static int binSearch(int arr[], int l, int r, int x){
        while(l <= r){
            int mid = (l + r)/2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] > x)
                r = mid-1;
            else
                l = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {34,45,56,67,78,89};
        int n = a.length;
        int x = 67;
        int result = binSearch(a,0,(n-1),x);
        if(result == -1)
            System.out.println("NUMBER IS NOT PRESENT IN LIST");
        else
            System.out.println("the number "+x+" is present at location "+(result+1));
    }
}
