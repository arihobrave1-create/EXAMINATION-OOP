public class SmartMeterTest {
              public static void main(String[] args) {
                            System.out.println("=== SmartMeter Test ===\n");

                            // Test 1: Create meter
                            SmartMeter meter = new SmartMeter("M001", 100.0);
                            System.out.println("Meter created: " + meter.getMeterId());
                            System.out.println("Initial balance: UGX " + meter.getCreditBalance());
                            System.out.println("Valve open: " + meter.isValveOpen());

                            // Test 2: Record consumption
                            System.out.println("\n--- Recording Consumption ---");
                            meter.recordConsumption(1.0); // Costs 50 UGX
                            System.out.println("Balance: UGX " + meter.getCreditBalance());

                            // Test 3: Load token
                            System.out.println("\n--- Loading Token ---");
                            meter.loadToken(200.0);
                            System.out.println("Balance: UGX " + meter.getCreditBalance());

                            // Test 4: Exhaust credit
                            System.out.println("\n--- Exhausting Credit ---");
                            meter.recordConsumption(5.0); // Costs 250 UGX
                            System.out.println("Balance: UGX " + meter.getCreditBalance());
                            System.out.println("Valve open: " + meter.isValveOpen());
              }
}