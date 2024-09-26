public class SearchInString {
    public static void main(String[] args) {
        String name = "fasi";
        char target = 's';
        boolean ans = search(name,target);
        System.out.println(ans);
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        // for (int i = 0; i < str.length(); i++) {
        //     if(target == str.charAt(i)){
        //         return true;
        //     }
        // }

        for(char ch: str.toCharArray()){
            if(ch == target){
                return false;
            }
        }
        return false;
    }
}
