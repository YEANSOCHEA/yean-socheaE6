import java.util.Scanner;

public class ShortDateConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a short date
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        // Extract year, month, and day
        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8, 10));

        // Convert month number to month name
        String monthName = getMonthName(month);

        // Display the full date representation
        System.out.println("Full date representation: " + monthName + " " + day + ", " + year);

        scanner.close();
    }

    // Method to convert month number to month name
    private static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"
        };

        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Invalid Month";
        }
    }
}