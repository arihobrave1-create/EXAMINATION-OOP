public class SavingsAccount extends Account implements Statement {
              private double interestRate;

              public SavingsAccount(String accountNumber, double initialBalance,
                                          Customer customer, double interestRate) {
                            super(accountNumber, initialBalance, customer);
                            this.interestRate = interestRate;
              }

              @Override
              public void withdraw(double amount) {
                            if (amount > 0 && amount <= balance) {
                                          balance -= amount;
                                          System.out.println("Withdrawn: UGX " + amount);
                            } else {
                                          System.out.println("Insufficient funds. Withdrawal refused.");
                            }
              }

              @Override
              public void deposit(double amount) {
                            if (amount > 0) {
                                          balance += amount;
                                          System.out.println("Deposited: UGX " + amount);
                            }
              }

              public void addInterest() {
                            double interest = balance * (interestRate / 100);
                            balance += interest;
                            System.out.println("Interest added: UGX " + String.format("%.2f", interest));
              }

              @Override
              public String generateStatement() {
                            return "Savings Account - " + super.generateStatement();
              }
}