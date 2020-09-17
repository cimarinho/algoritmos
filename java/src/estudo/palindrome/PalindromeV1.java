package estudo.palindrome;

public class PalindromeV1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("renner")); // true
        System.out.println(isPalindrome("Go dog")); // true
        System.out.println(isPalindrome("dog")); // false
    }

    static Boolean isPalindrome(String work) {
        String g = new StringBuilder(work).reverse().toString();
        return compareRemoveSpace(work).equalsIgnoreCase(compareRemoveSpace(g));
    }

    static String compareRemoveSpace(String withSpace) {
        return withSpace.replaceAll("\\s+", "");
    }
}
