
public class stringPalindrome {
    static boolean stringPalindrome1(int i,String str){
       
        if(i>=str.length()/2){
            return true;
        }

        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }

        return stringPalindrome1(i+1, str);
    }

    public static void main(String[] args) {
        
        String s = "ABCDCBA";

        System.out.println(stringPalindrome1(0, s));

        

    }
}
