public class SmartMeter {
    private String meterId;
    private double creditBalance;
    private boolean valveOpen;
    private static final double COST_PER_LITRE = 50.0; // UGX
    
    // Constructor
    public SmartMeter(String meterId, double openingCredit) {
        this.meterId = meterId;
        this.creditBalance = openingCredit;
        this.valveOpen = true;
    }
    
    // loadToken method
    public double loadToken(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid token amount. Must be positive.");
            return creditBalance;
        }
        
        creditBalance += amount;
        if (!valveOpen) {
            valveOpen = true;
            System.out.println("Valve re-opened. Credit loaded: UGX " + amount);
        } else {
            System.out.println("Credit loaded: UGX " + amount);
        }
        return creditBalance;
    }
    
    // recordConsumption method
    public boolean recordConsumption(double litres) {
        if (litres <= 0) {
            System.out.println("Invalid consumption amount.");
            return false;
        }
        
        if (!valveOpen) {
            System.out.println("Meter " + meterId + " is closed. Load token first.");
            return false;
        }
        
        double cost = litres * COST_PER_LITRE;
        
        if (creditBalance < cost) {
            creditBalance = 0;
            valveOpen = false;
            System.out.println("Credit exhausted. Valve closed.");
            return false;
        }
        
        creditBalance -= cost;
        System.out.println("Consumed " + litres + " litres. Cost: UGX " + cost);
        System.out.println("Remaining credit: UGX " + creditBalance);
        
        if (creditBalance == 0) {
            valveOpen = false;
            System.out.println("Credit exhausted. Valve closed.");
        }
        
        return true;
    }
    
    // Getters
    public String getMeterId() {
        return meterId;
    }
    
    public double getCreditBalance() {
        return creditBalance;
    }
    
    public boolean isValveOpen() {
        return valveOpen;
    }
}