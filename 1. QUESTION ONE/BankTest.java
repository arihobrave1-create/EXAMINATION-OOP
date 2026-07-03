public class BankTest {
              public static void main(String[] args) {
                            System.out.println("=== Q1: Banking System Test ===\n");

                            Customer customer = new Customer("C001", "Ariho Brave");
                            System.out.println("✓ Customer created: " + customer.getName());

                            SavingsAccount savings = new SavingsAccount("SAV001", 1000.0, customer, 5.0);
                            CurrentAccount current = new CurrentAccount("CUR001", 500.0, customer, 1000.0);

                            customer.addAccount(savings);
                            customer.addAccount(current);
                            System.out.println("✓ 2 accounts added to customer\n");

                            System.out.println("=== Part (d): Testing totalWorth() ===");
                            System.out.println("Initial Total Worth: UGX " + customer.totalWorth());

                            System.out.println("\n--- Making Transactions ---");
                            savings.deposit(500.0);
                            savings.addInterest();
                            current.withdraw(300.0);

                            System.out.println("\n=== Final Results ===");
                            System.out.println("Savings Balance: UGX " + savings.getBalance());
                            System.out.println("Current Balance: UGX " + current.getBalance());
                            System.out.println("TOTAL WORTH: UGX " + customer.totalWorth());

                            System.out.println("\n=== Account Statements ===");
                            System.out.println(savings.generateStatement());
                            System.out.println(current.generateStatement());

                            System.out.println("\n✓ Customer Details:");
                            System.out.println(customer);
              }
}