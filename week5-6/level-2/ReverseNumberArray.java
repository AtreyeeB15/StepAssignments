import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        String s = Long.toString(Math.abs(number));
        int count = s.length();
        
        int[] digits = new int[count];
        long tempNum = Math.abs(number);
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(tempNum % 10);
            tempNum /= 10;
        }

        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        input.close();
    }
}