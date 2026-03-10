import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        long number = Math.abs(input.nextLong());
        String temp = Long.toString(number);
        int count = temp.length();
        
        int[] digits = new int[count];
        long tempNum = number;
        
        for (int i = 0; i < count; i++) {
            digits[i] = (int) (tempNum % 10);
            tempNum /= 10;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            int digitValue = digits[i];
            frequency[digitValue]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }
        
        input.close();
    }
}