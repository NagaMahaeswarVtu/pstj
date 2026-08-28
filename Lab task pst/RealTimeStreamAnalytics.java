import java.util.*;

public class RealTimeStreamAnalytics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of readings
        int n = sc.nextInt();

        // Map to store sensor ID and its temperatures
        Map<String, List<Integer>> sensorData = new HashMap<>();

        // Read sensor readings
        for (int i = 0; i < n; i++) {
            String sensorId = sc.next();
            int temperature = sc.nextInt();

            // Filter temperatures greater than 50
            if (temperature > 50) {
                sensorData
                    .computeIfAbsent(sensorId, k -> new ArrayList<>())
                    .add(temperature);
            }
        }

        // Create list containing sensor ID and average temperature
        List<SensorAverage> result = new ArrayList<>();

        for (Map.Entry<String, List<Integer>> entry : sensorData.entrySet()) {
            String sensorId = entry.getKey();
            List<Integer> temperatures = entry.getValue();

            double sum = 0;

            for (int temp : temperatures) {
                sum += temp;
            }

            double average = sum / temperatures.size();

            result.add(new SensorAverage(sensorId, average));
        }

        // Sort by average temperature in descending order
        result.sort((a, b) -> Double.compare(b.average, a.average));

        // Display result
        for (SensorAverage sensor : result) {
            System.out.printf("%s %.1f%n", sensor.sensorId, sensor.average);
        }

        sc.close();
    }

    // Class to store sensor ID and average
    static class SensorAverage {
        String sensorId;
        double average;

        SensorAverage(String sensorId, double average) {
            this.sensorId = sensorId;
            this.average = average;
        }
    }
}
