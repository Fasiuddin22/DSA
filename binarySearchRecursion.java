public class binarySearchRecursion {
    static int binSearch(int arr[], int l, int r, int x)
    {
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] > x)
                return binSearch(arr,l,mid-1,x);
            else if(arr[mid] < x)
                return binSearch(arr,mid+1,r,x);

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12,23,34,45,56,67};
        int x = 67;
        int n = arr.length;
        int result = binSearch(arr,0,(n-1),x);
        if(result != -1)
            System.out.println("the number "+x+" is found at position "+(result+1));
        else
            System.out.println("result is not found");
    }
}
