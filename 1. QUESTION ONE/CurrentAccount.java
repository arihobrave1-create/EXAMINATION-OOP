public class CurrentAccount extends Account implements Statement {
              private double overdraftLimit;

              public CurrentAccount(String accountNumber, double initialBalance,
                                          Customer customer, double overdraftLimit) {
                            super(accountNumber, initialBalance, customer);
                            this.overdraftLimit = overdraftLimit;
              }

              @Override
              public void withdraw(double amount) {
                            if (amount > 0) {
                                          double availableFunds = balance + overdraftLimit;
                                          if (amount <= availableFunds) {
                                                        balance -= amount;
                                                        System.out.println("Withdrawn: UGX " + amount);
                                          } else {
                                                        System.out.println("Withdrawal exceeds overdraft limit.");
                                          }
                            }
              }

              @Override
              public void deposit(double amount) {
                            if (amount > 0) {
                                          balance += amount;
                                          System.out.println("Deposited: UGX " + amount);
                            }
              }

              @Override
              public String generateStatement() {
                            return "Current Account - " + super.generateStatement() +
                                                        ", Overdraft Limit: UGX "
                                                        + String.format("%.2f", overdraftLimit);
              }
}