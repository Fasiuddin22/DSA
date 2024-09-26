
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        bubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubleSort(int []arr){
        boolean Swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            Swapped = false;
            for (int j = 1; j < arr.length - i ; j++) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    Swapped = true;
                }
            }

            if(!Swapped){
                break;
            }
        }

        
    }
}
