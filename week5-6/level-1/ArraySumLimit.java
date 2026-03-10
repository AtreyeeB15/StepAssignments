import java.util.Scanner;

public class ArraySumLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double entry = input.nextDouble();
            if (entry <= 0) {
                break;
            }
            if (index == 10) {
                break;
            }
            values[index] = entry;
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
            total += values[i];
        }

        System.out.println("Total value: " + total);
        input.close();
    }
}