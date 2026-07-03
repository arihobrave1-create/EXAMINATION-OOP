import java.util.ArrayList;
import java.util.List;

public class Customer {
              private String customerId;
              private String name;
              private List<Account> accounts;

              public Customer(String customerId, String name) {
                            this.customerId = customerId;
                            this.name = name;
                            this.accounts = new ArrayList<>();
              }

              public String getCustomerId() {
                            return customerId;
              }

              public String getName() {
                            return name;
              }

              public List<Account> getAccounts() {
                            return accounts;
              }

              public void addAccount(Account account) {
                            accounts.add(account);
              }

              public double totalWorth() {
                            double total = 0.0;
                            for (Account account : accounts) {
                                          total += account.getBalance();
                            }
                            return total;
              }

              @Override
              public String toString() {
                            return "Customer: " + name + " (ID: " + customerId +
                                                        "), Total Worth: UGX " + String.format("%.2f", totalWorth());
              }
}