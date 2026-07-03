import java.util.Random;

public class NARORainfallAnalysis {
              public static void main(String[] args) {
                            // (i) Generate 30 random daily rainfall readings between 0 and 60 mm
                            double[] dailyRainfall = generateRainfallData(30);

                            // (ii) Compute total and average
                            double total = calculateTotal(dailyRainfall);
                            double average = total / dailyRainfall.length;

                            // (iii) Count wet days (rainfall > 30mm)
                            int wetDays = countWetDays(dailyRainfall, 30.0);

                            // (iv) Classify the month
                            String classification = classifyMonth(total);

                            // Display results
                            displayResults(dailyRainfall, total, average, wetDays, classification);
              }

              // Method to generate rainfall data
              private static double[] generateRainfallData(int days) {
                            Random rand = new Random();
                            double[] rainfall = new double[days];
                            for (int i = 0; i < days; i++) {
                                          rainfall[i] = rand.nextDouble() * 60; // 0 to 60 mm
                            }
                            return rainfall;
              }

              // Method to calculate total rainfall
              private static double calculateTotal(double[] rainfall) {
                            double total = 0.0;
                            for (double rain : rainfall) {
                                          total += rain;
                            }
                            return total;
              }

              // Method to count wet days
              private static int countWetDays(double[] rainfall, double threshold) {
                            int count = 0;
                            for (double rain : rainfall) {
                                          if (rain > threshold) {
                                                        count++;
                                          }
                            }
                            return count;
              }

              // Method to classify the month
              private static String classifyMonth(double totalRainfall) {
                            if (totalRainfall <= 300) {
                                          return "Dry Season";
                            } else if (totalRainfall < 600) {
                                          return "Normal Season";
                            } else {
                                          return "Flood Risk";
                            }
              }

              // Method to display results
              private static void displayResults(double[] rainfall, double total,
                                          double average, int wetDays, String classification) {
                            System.out.println("=== NARO Rainfall Analysis ===");
                            System.out.println("Daily Rainfall Readings (mm):");
                            for (int i = 0; i < rainfall.length; i++) {
                                          System.out.printf("Day %2d: %.2f mm%n", (i + 1), rainfall[i]);
                            }
                            System.out.println("\n=== Summary Statistics ===");
                            System.out.printf("Total Monthly Rainfall: %.2f mm%n", total);
                            System.out.printf("Average Daily Rainfall: %.2f mm%n", average);
                            System.out.println("Number of Wet Days (> 30mm): " + wetDays);
                            System.out.println("Season Classification: " + classification);
              }
}