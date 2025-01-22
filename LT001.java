public class LT001 {
    public static void main(String[] args) {
        int x = 121; // You can change this to test different values
        System.out.println(isPalindrome(x)); // Call the method to check if the number is a palindrome
    }

    public static boolean isPalindrome(int x) {
        // If x is negative or ends with zero but is not zero itself, it's not a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversedHalf = 0;
        // Reverse half of the number and compare with the other half
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        
        // If the number has an odd number of digits, we can remove the middle digit
        return x == reversedHalf || x == reversedHalf / 10;
    }
}