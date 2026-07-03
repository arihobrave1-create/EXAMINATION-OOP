public class InsufficientFundsException extends Exception {
              private double amount;
              private double balance;

              public InsufficientFundsException(String message) {
                            super(message);
              }

              public InsufficientFundsException(String message, double amount, double balance) {
                            super(message);
                            this.amount = amount;
                            this.balance = balance;
              }

              public double getAmount() {
                            return amount;
              }

              public double getBalance() {
                            return balance;
              }
}