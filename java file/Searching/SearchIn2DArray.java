
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][]arr = {
            {34,35,36},
            {23,24,25,26},
            {74,73,72,79},
            {96,93}
        };
        int target = 50;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int [] search(int [][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
