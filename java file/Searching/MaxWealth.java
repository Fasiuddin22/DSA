public class MaxWealth {
    public static void main(String[] args) {
        int [][]arr = {
            {1,5},
            {7,3},
            {3,5}
        };
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxsum = 0;
        for (int row = 0; row < accounts.length; row++) {
            int rowsum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                rowsum += accounts[row][col];
            }
            if(rowsum > maxsum){
                maxsum = rowsum;
            }
        }
        return maxsum;
    }
}
