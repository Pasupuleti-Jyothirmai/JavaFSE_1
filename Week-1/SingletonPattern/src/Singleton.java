public class Singleton {

    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Private constructor
    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    // Step 3: Public method to return the same instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("Hello from Singleton Class");
    }
}