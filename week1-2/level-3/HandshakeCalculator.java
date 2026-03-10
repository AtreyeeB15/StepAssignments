import java.util.Scanner;

// Class to calculate the maximum number of handshakes among N students
class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Formula: (n * (n - 1)) / 2
        int totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        System.out.println("The maximum number of possible handshakes among " + 
                           numberOfStudents + " students is " + totalHandshakes);
        input.close();
    }
}