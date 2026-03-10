// Class to calculate the average percentage of PCM marks
class AverageMarks {
    public static void main(String[] args) {
        String name = "Sam";
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int totalSubjects = 3;
        
        // Calculate average
        double averagePercent = (double) (maths + physics + chemistry) / totalSubjects;
        
        System.out.println(name + "’s average mark in PCM is " + averagePercent);
    }
}