import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int[] digits = storeDigits(num);
        
        System.out.println("Digit count: " + digits.length);
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
    }

    public static int[] storeDigits(int num) {
        String temp = Integer.toString(num);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            digits[i] = Character.getNumericValue(temp.charAt(i));
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        // A duck number contains a 0, but not as the first digit
        // (Note: leading zeros are usually handled by the input type)
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
}