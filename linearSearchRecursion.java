public class linearSearchRecursion {
    static int search(int arr[], int N, int x){
        if(N == 0)
            return -1;
        else if(arr[N-1] == x)
            return (N-1);
        return search(arr, N-1, x);
    }
    public static void main(String[] args) {
        int a[] = {23,56,12,23,11};
        int n = 5;
        int x = 12;
        int result = search(a, n, x);
        if (result != -1)
            System.out.println("the key "+ x + " is present at the index "+ result);
        else
            System.out.println("the result "+ x +"is not present in the array");

    } 
}
