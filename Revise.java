public class Revise {

    // Method that throws an exception
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is less than 18, access denied.");
        }
        System.out.println("Access granted.");
    }

    public static void main(String[] args) {
        try {
            // Calling method that may throw an exception
            checkAge(15);  // This will throw an exception
        } catch (Exception e) {
            // Catching the exception
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            // Finally block, always executed
            System.out.println("This block is always executed.");
        }
    }
}
