
    import java.util.Scanner;

    public class exam3 {
        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the number of elements
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            // Create an array to store the numbers
            int[] numbers = new int[n];

            // Prompt the user to enter the numbers
            System.out.println("Enter the numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            // Display the input numbers
            System.out.println("Input numbers:");
            for (int number : numbers) {
                System.out.println(number);
            }

            // Close the Scanner object
            scanner.close();
        }
    }


