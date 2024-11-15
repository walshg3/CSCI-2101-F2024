package week7;

public class HardLoops {



    /*
     * Given a non-empty String and an int N, return the string made starting with char0, and then every Nth char of the string.
     * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
     * everyNth("Miracle", 2) → "Mrce"
     * everyNth("abcdefg", 2) → "aceg"
     * everyNth("abcdefg", 3) → "adg"
    */
    public static String everyNth(String str, int n){
        String result = "";
        for (int i = 0; i < str.length(); i+=n) { // can also be written as i = i + n
            // 0 = 0 + 2, i = 2
            // 2 = 2 + 2, i = 4
            // 4 = 4 + 2, i = 6
            result += str.charAt(i);
        }
        return result;
    }

    /*
     * Given a string create a new string that will move the first char to the end of the following 2 chars.
     * For example, "abc" will return "bca"
     * oneTwo("abc") → "bca"
     * oneTwo("tca") → "cat"
     * oneTwo("tcagdo") → "catdog"
     * oneTwo("tcagd") → "catgd"
    */
    public static String oneTwo(String str){
        String result = "";
        for (int i = 0; i < str.length()-2; i+=3) {
            result += str.substring(i+1, i + 3) + str.charAt(i);
        }
        return result;
    }

    /*
     * Create a method that will check if a string is a palindrome
     * A palindrome is a word that is spelled the same forwards and backwards
     * Ex. racecar, mom, dad, radar
     * 
     * isPalindrome("racecar") → true
     * isPalindrome("hello") → false
     * isPalindrome("mom") → true
     * isPalindrome("dad") → true
     * isPalindrome("radar") → true
     * 
    */
    public static boolean isPalindrome(String str){
        boolean result = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                result = false;
            }
        }
        return result;
    }

    /*
     * Create the isPalindrome method using a while loop 
    */
    public static boolean isPalindromeWhile(String str){
        boolean result = true;
        int i = 0;
        while(i < str.length() / 2){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                result = false;
            }
            i++;
        }
        return result;
    }

    /*
     * Create a method that will count the number of times 'xx' appears in a string then return 
     * the number of times it appears.
     * EX.
     * countXX("abcxx") → 1
     * countXX("xxx") → 2
     * countXX("xxxx") → 3
     * countXX("abc") → 0
     *  
    */
    public static int countXX(String str){
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == 'x' && str.charAt(i + 1) == 'x')
            result ++;
        }
        return result;
    }

    public static int countXX2(String str){
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.substring(i,i+2).equals("xx")){
                result++;
            }
        }
        return result;
    }

    

    public static void main(String[] args) {
        System.out.println("Start of harder Loop examples");
        System.out.println(everyNth("Miracle", 2)); // Mrce
        System.out.println(oneTwo("abc")); // bca
        System.out.println(oneTwo("tcagdo")); // catdog

        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindromeWhile("mom")); // true
        System.out.println(isPalindromeWhile("jasdjas")); // false

        System.out.println(countXX("abcxx")); // 1
        System.out.println(countXX("xxx")); // 2
        System.out.println(countXX("axxbxxcxx"));
    }
}
