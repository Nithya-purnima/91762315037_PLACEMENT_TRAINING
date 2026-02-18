public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        // Negative numbers or numbers ending with 0 (except 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x = x / 10;
        }
        // For Even no.of digits & Odd no.of digits 
        return (x == reversedHalf || x == reversedHalf / 10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(454));
        System.out.println(isPalindrome(4554));
    }
}
