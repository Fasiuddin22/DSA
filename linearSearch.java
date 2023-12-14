class linearSearch{
    static int search(int arr[], int N, int x){
        for(int i = 0; i < N; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String [] args){
        int [] arr = {45,32,67,12,98};
        int n = arr.length;
        int x = 32;
        
        int result = search(arr,n,x);
        if(result == -1)
            System.out.println("value is not present in the array...");
        else
            System.out.println("value is present at position " + result+1);
    }
}
