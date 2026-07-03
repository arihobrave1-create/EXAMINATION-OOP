public class BankAccount {
              private double balance;

              public BankAccount(double initialBalance) {
                            this.balance = initialBalance;
              }

              public void withdraw(double amount) throws InsufficientFundsException {
                            if (amount > balance) {
                                          throw new InsufficientFundsException(
                                                                      "Insufficient funds. Requested: " + amount
                                                                                                  + ", Available: "
                                                                                                  + balance,
                                                                      amount, balance);
                            }
                            balance -= amount;
              }

              public double getBalance() {
                            return balance;
              }
}