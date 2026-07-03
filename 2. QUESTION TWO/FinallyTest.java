public class FinallyTest {
              public static int testFinally() {
                            try {
                                          return 10;
                            } finally {
                                          return 20;
                            }
              }

              public static void main(String[] args) {
                            System.out.println("=== Part (a) - Finally Override ===");
                            System.out.println("Output: " + testFinally());
              }
}