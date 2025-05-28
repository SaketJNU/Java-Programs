public class SecondLargest {
    public static void main(String[] args) {
        // Check if at least two numbers are provided
        if (args.length < 2) {
            System.out.println("Please enter at least two numbers as command-line arguments.");
            return;
        }

        int[] numbers = new int[args.length];

        // Parse command line arguments to integers
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + args[i] + " is not a valid integer.");
                return;
            }
        }

        // Find the largest and second largest numbers
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Handle the case when all elements are the same
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
