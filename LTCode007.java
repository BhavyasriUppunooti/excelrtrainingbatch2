class LTCode007 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  
                return digits;
            }
            digits[i] = 0;  
        }
        
        int[] result = new int[n + 1];
        result[0] = 1;  
        return result;
    }

    public static void main(String[] args) {
        LTCode007 solution = new LTCode007();
        
        int[] digits = {9, 9, 9};  // Example input
        int[] result = solution.plusOne(digits);
        
        // Print the result
        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
