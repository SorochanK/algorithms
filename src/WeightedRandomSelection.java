import java.util.*;

public class WeightedRandomSelection {

    private static final Random random = new Random();

    public static <T> T getRandomItem(Map<T, Double> weightedMap) {
        List<T> items = new ArrayList<>(weightedMap.keySet());
        List<Double> weights = new ArrayList<>(weightedMap.values());

        // Calculate total weight
        double totalWeight = weights.stream().mapToDouble(weight -> weight).sum();

        // Generate a random number between 0 and total weight
        double randomWeight = random.nextDouble() * totalWeight;

        // Loop through items and subtract weight until randomWeight is negative
        for (int i = 0; i < items.size(); i++) {
            randomWeight -= weights.get(i);
            if (randomWeight < 0) {
                return items.get(i);
            }
        }

        // Should never reach this point, but just in case
        throw new IllegalStateException("No item was selected");
    }

    public static void main(String[] args) {
        Map<String, Double> weightedMap = new HashMap<>();
        weightedMap.put("A", 0.5);
        weightedMap.put("B", 0.3);
        weightedMap.put("C", 0.2);

        for (int i = 0; i < 10; i++) {
            String item = getRandomItem(weightedMap);
            System.out.println(item);
        }
    }
}
