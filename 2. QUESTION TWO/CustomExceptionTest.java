public class CustomExceptionTest {
              public static void main(String[] args) {
                            System.out.println("=== Part (c) - Custom Checked Exception ===\n");

                            BankAccount account = new BankAccount(500.0);
                            System.out.println("Initial balance: " + account.getBalance());

                            // Test 1: Withdrawal exceeding balance
                            System.out.println("\nAttempting to withdraw 600.0");
                            try {
                                          account.withdraw(600.0);
                            } catch (InsufficientFundsException e) {
                                          System.out.println("Caught Exception: " + e.getMessage());
                                          System.out.println("Requested amount: " + e.getAmount());
                                          System.out.println("Available balance: " + e.getBalance());
                            }

                            // Test 2: Successful withdrawal
                            System.out.println("\nAttempting to withdraw 300.0");
                            try {
                                          account.withdraw(300.0);
                            } catch (InsufficientFundsException e) {
                                          System.out.println("Error: " + e.getMessage());
                            }

                            System.out.println("\n=== Checked vs Unchecked Exceptions ===");
                            System.out.println("Checked Exception: Must be caught or declared in throws clause");
                            System.out.println("  - Example: IOException, SQLException, InsufficientFundsException");
                            System.out.println("Unchecked Exception: Not required to be caught or declared");
                            System.out.println("  - Example: NullPointerException, ArithmeticException");
              }
}