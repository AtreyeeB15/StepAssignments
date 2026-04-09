import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];

        // Input loop
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Processing loop
        System.out.println("\n--- Voting Results ---");
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): " + 
                               (canVote ? "Can Vote" : "Cannot Vote"));
        }
    }

    public static boolean canStudentVote(int age) {
        if (age < 0) return false; // Validation for negative age
        return age >= 18;
    }
}