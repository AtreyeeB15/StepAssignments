// Class to calculate and display the age of a person
class AgeCalculator {
    public static void main(String[] args) {
        String name = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;
        
        // Calculate age
        int age = currentYear - birthYear;
        
        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}