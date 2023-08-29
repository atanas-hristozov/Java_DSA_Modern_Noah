import java.util.*;

public class ModernNoah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines of input
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Initialize a map to store the counts of each animal species
        Map<String, Integer> animalCounts = new TreeMap<>();

        // Read the animal species and update the counts
        for (int i = 0; i < n; i++) {
            String animal = scanner.nextLine().trim();
            animalCounts.put(animal, animalCounts.getOrDefault(animal, 0) + 1);
        }

        // Print the counts and whether they are even or not
        for (Map.Entry<String, Integer> entry : animalCounts.entrySet()) {
            String species = entry.getKey();
            int count = entry.getValue();
            boolean isEven = count % 2 == 0;
            String evenStatus = isEven ? "Yes" : "No";
            System.out.println(species + " " + count + " " + evenStatus);
        }

        scanner.close();
    }
}