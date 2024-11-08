package week6;

public class hardLoops {



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

    public static void main(String[] args) {
        System.out.println("Start of harder Loop examples");
        System.out.println(everyNth("Miracle", 2)); // Mrce
        System.out.println(oneTwo("abc")); // bca
        System.out.println(oneTwo("tcagdo")); // catdog
    }
}
