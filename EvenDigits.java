public class EvenDigits {
    public static void main(String[] args) {
        int [] arr = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(isEvenDigit(num)){
                count++;
            }
        }
        return count;
    }

    static boolean isEvenDigit(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num){

        return (int)Math.log10(num) + 1;
        // if(num < 0){
        //     num = num * -1;
        // }
        // int count = 0;
        // while (num > 0) { 
        //     count++;
        //     num = num / 10;
        // }
        // return count;
    }
}
