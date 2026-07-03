public abstract class Account {
              protected String accountNumber;
              protected double balance;
              protected Customer customer;

              public Account(String accountNumber, double initialBalance, Customer customer) {
                            this.accountNumber = accountNumber;
                            this.balance = initialBalance;
                            this.customer = customer;
              }

              public String getAccountNumber() {
                            return accountNumber;
              }

              public double getBalance() {
                            return balance;
              }

              public Customer getCustomer() {
                            return customer;
              }

              public abstract void withdraw(double amount);

              public abstract void deposit(double amount);

              public String generateStatement() {
                            return "Account Number: " + accountNumber +
                                                        ", Current Balance: UGX " + String.format("%.2f", balance);
              }
}