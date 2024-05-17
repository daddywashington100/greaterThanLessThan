import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of Reese's peanut butter cups
        int numCups = scanner.nextInt();

        // Read whether it is the weekend
        boolean isWeekend = scanner.nextBoolean();

        // Check if the party was successful
        boolean isSuccessful = false;
        if (isWeekend) {
            isSuccessful = (numCups >= 15 && numCups <= 25);
        } else {
            isSuccessful = (numCups >= 10 && numCups <= 20);
        }

        // Print the result
        System.out.println(isSuccessful);

        scanner.close();
    }
}
