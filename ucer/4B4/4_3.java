import java.io.*;

class ExceptionDemo {

    // Method demonstrating a checked exception
    public static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName); // may throw FileNotFoundException
        BufferedReader fileInput = new BufferedReader(file);

        System.out.println("Reading first line from file:");
        System.out.println(fileInput.readLine());

        fileInput.close();
    }

    // Method demonstrating an unchecked exception
    public static void divide(int a, int b) {
        int result = a / b; // may throw ArithmeticException
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        // Handling unchecked exception
        try {
            System.out.println("Demonstrating Unchecked Exception:");
            divide(10, 0); // division by zero
        } catch (ArithmeticException e) {
            System.out.println("Caught an unchecked exception: " + e);
        }

        // Handling checked exception
        try {
            System.out.println("\nDemonstrating Checked Exception:");
            readFile("nonexistentfile.txt"); // file may not exist
        } catch (IOException e) {
            System.out.println("Caught a checked exception: " + e);
        }
    }
}

