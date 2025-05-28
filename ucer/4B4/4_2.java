import java.util.Scanner;

// User-defined (custom) checked exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class CustomExceptionDemo {

    // Method that throws the custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older to register.");
        } else {
            System.out.println("Age is valid. You are eligible to register.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Call method that may throw custom exception
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e);
        } finally {
            // Cleanup or final message
            System.out.println("Execution completed. Thank you!");
            scanner.close();
        }
    }
}

