public class RiskyTest {
              public static int risky(int x) {
                            try {
                                          if (x == 0)
                                                        throw new Exception("Zero");
                                          return 10 / x;
                            } catch (Exception e) {
                                          return -1;
                            } finally {
                                          System.out.println("Finally");
                            }
              }

              public static void main(String[] args) {
                            System.out.println("=== Part (b) - Exception Handling ===");

                            System.out.print("risky(0): ");
                            int result1 = risky(0);
                            System.out.println("Return value: " + result1);

                            System.out.print("risky(2): ");
                            int result2 = risky(2);
                            System.out.println("Return value: " + result2);
              }
}