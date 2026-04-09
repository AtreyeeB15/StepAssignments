public class FootballTeamStats {
    public static void main(String[] args) {
        int[] heights = new int[11];

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; 
            System.out.println("Player " + (i + 1) + " height: " + heights[i] + " cm");
        }

        System.out.println("\n--- Statistics ---");
        System.out.println("Shortest: " + findShortest(heights) + " cm");
        System.out.println("Tallest: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + calculateMean(heights) + " cm");
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static double calculateMean(int[] arr) {
        double sum = 0;
        for (int h : arr) sum += h;
        return sum / arr.length;
    }
}