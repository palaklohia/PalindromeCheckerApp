public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        // Convert string to character array
        char[] chars = text.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input text : " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}