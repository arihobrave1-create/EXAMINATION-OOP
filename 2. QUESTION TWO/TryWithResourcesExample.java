import java.io.*;

public class TryWithResourcesExample {
              public static void main(String[] args) {
                            System.out.println("\n=== Part (d) - Try-with-Resources ===");

                            // Create a sample file first
                            try (FileWriter writer = new FileWriter("data.txt")) {
                                          writer.write("Hello World\n");
                                          writer.write("This is a test file\n");
                                          writer.write("Java try-with-resources example\n");
                            } catch (IOException e) {
                                          System.err.println("Error creating file: " + e.getMessage());
                            }

                            // Read using try-with-resources
                            try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
                                          String line;
                                          System.out.println("Reading file content:");
                                          while ((line = br.readLine()) != null) {
                                                        System.out.println(line);
                                          }
                            } catch (IOException e) {
                                          System.err.println("Error reading file: " + e.getMessage());
                            }
                            // BufferedReader is automatically closed here
                            System.out.println("✓ File closed automatically by try-with-resources");
              }
}