package geeksforgeeks;

/**
 * Given two strings S1 and S2 as input.
 * Your task is to concatenate two strings and then reverse the string. Finally print the reversed string.
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(1%2);
        System.out.println(conRevstr("Geeks", "forGeeks"));
    }

    static String conRevstr(String S1, String S2) {
        String s = S1.concat(S2);
        String res = "";

        char[] a = new char[s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }

        return res;
    }
}
